package controle;

import javax.swing.JOptionPane;

public class IfElseIf {
	
	public static void main(String[] args) {
		String nota = JOptionPane.showInputDialog("Digita a nota");
		int numero = Integer.parseInt(nota);
		if (numero > 10 || numero < 0) {
			JOptionPane.showInternalMessageDialog(null, "Nota inválida!");
		}
		else if (numero >= 8) {
				JOptionPane.showInternalMessageDialog(null, "Conceito A");			
		} else if (numero >= 6.1) {
			JOptionPane.showInternalMessageDialog(null, "Conceito B");			
		} else if (numero >= 4.1) {
			JOptionPane.showInternalMessageDialog(null, "Conceito C");			
		} else if (numero >= 2.1) {
				JOptionPane.showInternalMessageDialog(null, "Conceito D");			
		} else {
			JOptionPane.showInternalMessageDialog(null, "Conceito E");
		}

	}

}
