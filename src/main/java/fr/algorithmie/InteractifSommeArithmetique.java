package fr.algorithmie;

import java.util.Scanner;

public class InteractifSommeArithmetique {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);

		System.out.println("Veuillez saisir un nombre: ");
		int nb = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= nb; i++) {
			sum += i;
		}
		System.out.println(sum);

	}

}
