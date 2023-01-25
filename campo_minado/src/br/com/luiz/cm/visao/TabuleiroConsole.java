package br.com.luiz.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.luiz.cm.excecao.ExplosaoException;
import br.com.luiz.cm.excecao.SairException;
import br.com.luiz.cm.modelo.Tabuleiro;

public class TabuleiroConsole {

	private Tabuleiro tabuleiro;
	private Scanner sc = new Scanner(System.in);
	
	public TabuleiroConsole(Tabuleiro tabuleiro) {
		this.tabuleiro =  tabuleiro;
		
		executarJogo();
	}

	private void executarJogo() {
		try {
			boolean continuar = true;
			while (continuar) {
				cicloDoJogo();
				System.out.println("Outra partida? (S/n) ");
				String resposta = sc.nextLine();
				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Tchau!!");
		} finally {
			sc.close();
		}
		
	}

	private void cicloDoJogo() {
		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro);
				
				String digitado = capturarValorDigitado("Digite (x, y): ");
				Iterator<Integer> xy = Arrays.stream(digitado.split(","))
						.map(e -> Integer.parseInt(e.trim())).iterator();
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");

				if ("1".equals(digitado)) {
					tabuleiro.abrir(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
				
			}
			System.out.println("Você ganhou!");
		} catch (ExplosaoException e) {
			System.out.println("Você perdeu!");
		}	
	}
	
	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = sc.nextLine();
		
		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
