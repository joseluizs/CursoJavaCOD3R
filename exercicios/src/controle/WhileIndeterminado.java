package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String dado = "";
		
		while (!dado.equalsIgnoreCase("fim")){
			System.out.print("Digite algo ");
			dado = sc.nextLine();
		}
		sc.close();

	}

}
