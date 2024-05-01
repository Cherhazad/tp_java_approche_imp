package fr.algorithmie;

import java.util.Scanner;

public class InteractifFibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int nbr1 = 0, nbr2 = 1, nbr3, i;
		
		System.out.println("Veuillez sélectionner un rang N: ");
		int nb = scanner.nextInt();
		int N = nb;
		
		System.out.print(nbr1 + " " + nbr2);

		
		for (i = 2; i < N; ++i) {
			nbr3 = nbr1 + nbr2;
			nbr1 = nbr2;
			nbr2 = nbr3;
			System.out.print(" " + nbr3);

		}
	}

}
