package fr.algorithmie;

import java.util.Scanner;

public class InteractifTableMult {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		while (true) {

			System.out.println("Veuillez saisir une valeur comprise entre 1 et 10: ");
			int nb = scanner.nextInt();
			
			if (nb >= 1 && nb <= 10) {
		        System.out.println("Vous avez saisi: " + nb);
		        
		        for (int i=1; i<=10; i++) {
		        int tableMulti = nb *i;
		        System.out.println(nb + "*" + i + "=" + tableMulti);
		        }
		        break;
		    } else {
		        System.out.println("La valeur saisie n'est pas comprise entre 1 et 10.");
		    }
		}

	}

}
