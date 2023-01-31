package br.com.luiz.cm.visao;

import java.awt.Color;

import javax.swing.BorderFactory;
import javax.swing.JButton;

import br.com.luiz.cm.modelo.Campo;
import br.com.luiz.cm.modelo.CampoEvento;
import br.com.luiz.cm.modelo.CampoObservador;

@SuppressWarnings("serial")
public class BotaoCampo extends JButton implements CampoObservador{

	private final Color BG_PADRAO = new Color(184, 184, 184);
	private final Color BG_MARCAR = new Color(8, 179, 247);
	private final Color BG_EXPLODIR = new Color(189, 66, 68);
	private final Color TEXTO_VERDE = new Color(0, 100, 0);
	
	private Campo campo;
	
	public BotaoCampo(Campo campo) {
		this.campo = campo;
		setBorder(BorderFactory.createBevelBorder(0));
		setBackground(BG_PADRAO);
	}

	@Override
	public void eventoOcorreu(Campo campo, CampoEvento evento) {
		switch (evento) {
		case ABRIR:
			aplicarEstiloAbrir();
			break;
		case MARCAR:
			aplicarEstiloMarcar();
			break;
		case EXPLODIR:
			aplicarEstiloExplodir();
			break;
		default:
			aplicarEstiloPadrao();
			break;
		}
		
	}

	private void aplicarEstiloPadrao() {
		
	}

	private void aplicarEstiloExplodir() {
		
	}

	private void aplicarEstiloMarcar() {
		
	}

	private void aplicarEstiloAbrir() {
		
	}
}
