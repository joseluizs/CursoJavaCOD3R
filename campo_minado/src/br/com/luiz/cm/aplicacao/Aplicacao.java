package br.com.luiz.cm.aplicacao;

import br.com.luiz.cm.modelo.Tabuleiro;
import br.com.luiz.cm.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {

		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}

}
