drop table estados;

create table estados(
id INT unsigned not null auto_increment,
nome varchar(45) not null,
sigla varchar(2) not null,
regiao enum('Norte', 'Nordeste','Centro-Oeste','Sudeste','Sul') not null,
populacao decimal(5,2) not null,
primary key (id), 
unique key(nome),
unique key(sigla));

insert into estados (nome, sigla, regiao, populacao) values ('Acre', 'AC', 'Norte', 0.83);
insert into estados (nome, sigla, regiao, populacao) values ('Alagoas', 'AL', 'Nordeste', 3.38), 
															('Amapá', 'AP', 'Norte', 0.8),
															('Amazonas', 'AM', 'Norte', 4.06);
select * from estados;                                                            

select sigla, nome as 'Nome do Estado' from estados where regiao = 'Sul';

select nome, regiao from estados where populacao >= 10 order by populacao desc;

SELECT * FROM wm.estados;

select nome as 'NOME', regiao as 'REGIÃO', populacao as 'POPULAÇÃO' from estados where populacao >= 10 order by populacao desc;

update estados set nome = 'Paraná' where sigla = 'PR';

update estados set nome = 'Paraná', populacao = 11.32 where sigla = 'PR';

select est.nome, sigla, populacao from estados est where sigla = 'PR';

insert into estados (id, nome, sigla, regiao, populacao) values (1000, 'Novo', 'NV', 'Norte', 2.51);
select * from estados;
insert into estados (nome, sigla, regiao, populacao) values ( 'Mais Novo', 'MV', 'Norte', 2.51);

delete from estados where sigla = 'MV';

delete from estados where id >=900;

select regiao as 'Região', sum(populacao) as Total from estados group by regiao order by Total desc;

select sum(populacao) as Total from estados ;

select avg(populacao) as Total from estados ;

create table if not exists cidades(
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    estado_id int unsigned not null,
    area decimal(10,2),
    primary key (id),
    foreign key(estado_id) references estados (id)
);

insert into cidades (nome, area, estado_id) values ('Campinas', 133.9, 25);
update cidades set nome = 'Campinas', area = 795 where estado_id = '25';

insert into cidades (nome, area, estado_id) values ('Niterói', 133.9, 19);

insert into cidades (nome, area, estado_id) values ('Caruaru', 92.6, (select id from estados where sigla = 'PE'));
insert into cidades (nome, area, estado_id) values ('Juazeiro do Norte', 248.2, (select id from estados where sigla = 'CE'));

select * from cidades;

select * from estados e, cidades c where e.id = c.estado_id;
select e.nome as Estado, c.nome as Cidade, regiao as Região from estados e, cidades c where e.id = c.estado_id;
select e.nome as Estado, c.nome as Cidade, regiao as Região, e.populacao as População from estados e, cidades c where e.id = c.estado_id;
select c.nome as Cidade,
		e.nome as Estado,
        regiao as Região
from estados e
inner join cidades c 
on e.id = c.estado_id;

create table if not exists prefeitos(
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cidade_id int unsigned,
    primary key (id),
    unique key (cidade_id),
    foreign key(cidade_id) references cidades (id)
);

insert into prefeitos (nome, cidade_id) values ('Rodrigo Neves',2),
												('Raquel Lyra',3),
                                                ('Zenaldo Coutinho', null);
select *  from prefeitos;
insert into prefeitos (nome, cidade_id) values ('Rafael Greca',null);

select * from cidades c inner join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id;
select * from cidades c right join prefeitos p on c.id = p.cidade_id;
-- select * from cidades c full join prefeitos p on c.id = p.cidade_id;
select * from cidades c left join prefeitos p on c.id = p.cidade_id
union
select * from cidades c right join prefeitos p on c.id = p.cidade_id;

create table if not exists empresas(
	id int unsigned not null auto_increment,
    nome varchar(255) not null,
    cnpj int unsigned,
    primary key (id),
    unique key (cnpj)
);

create table if not exists empresas_unidades (
	empresa_id  int unsigned not null,
    cidade_id int unsigned not null, 
    sede tinyint(1) not null,
    primary key (empresa_id, cidade_id)
);

alter table empresas modify cnpj varchar(14);

insert into empresas(nome, cnpj)
values('Mistura Mineira', 98765432102145),
		('Teck Store', 23456789123456),
        ('Studio', 65498732198712);

desc empresas;
desc prefeitos;

insert into empresas_unidades
	(empresa_id, cidade_id, sede)
values
	(1, 1, 1),
    (1, 2, 0),
    (2, 1, 0),
    (2, 2, 1);
    
select e.nome Empresa, c.nome Cidade
from empresas e, empresas_unidades eu, cidades c 
where e.id = eu.empresa_id
and c.id = eu.cidade_id
and sede