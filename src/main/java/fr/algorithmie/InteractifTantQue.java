package fr.algorithmie;

import java.util.Scanner;

public class InteractifTantQue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		while (true) {
		    System.out.println("Veuillez saisir un nombre compris entre 1 et 10: ");
		    int nb = scanner.nextInt();

		    if (nb >= 1 && nb <= 10) {
		        System.out.println("Vous avez saisi: " + nb);
		        break;
		    } else {
		        System.out.println("La valeur saisie n'est pas comprise entre 1 et 10.");
		    }
		}

	}

}
