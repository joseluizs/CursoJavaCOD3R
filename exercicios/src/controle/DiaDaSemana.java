package controle;

import javax.swing.JOptionPane;

public class DiaDaSemana {
	
	public static void main(String[] args) {
		String dia = JOptionPane.showInputDialog("Digita Dia");
		
		if (dia.equalsIgnoreCase("domingo")) {
			JOptionPane.showInternalMessageDialog(null, "1");
		}
		else if (dia.equalsIgnoreCase("segunda")) {
			JOptionPane.showInternalMessageDialog(null, "2");			
		} else if (dia.equalsIgnoreCase("terça")) {
			JOptionPane.showInternalMessageDialog(null, "3");			
		} else if(dia.equalsIgnoreCase("quarta")) {
			JOptionPane.showInternalMessageDialog(null, "4");		
		} else if (dia.equalsIgnoreCase("quinta")) {
			JOptionPane.showInternalMessageDialog(null, "5");			
		} else if (dia.equalsIgnoreCase("sexta")) {
			JOptionPane.showInternalMessageDialog(null, "6");			
		} else {
			JOptionPane.showInternalMessageDialog(null, "7");
		}
		JOptionPane.showInternalMessageDialog(null, "Fim");
	}

}
