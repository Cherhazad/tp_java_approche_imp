package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifPlusGrand {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int max = Integer.MIN_VALUE;

		Scanner scanner = new Scanner(System.in);

		for (int i = 0; i <= 10; i++) {
			System.out.println("n°" + i + "_" + " Veuillez saisir un nombre: ");
			int nb = scanner.nextInt();

			if (nb > max) {
				max = nb;
			}
		}
		
		System.out.println("La valeur maximale saisie est : " + max);

        scanner.close();
	}

}
