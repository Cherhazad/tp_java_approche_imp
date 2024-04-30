package fr.algorithmie;

import java.util.Scanner;

public class InteractifPlusMoins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int randomValues = (int) (Math.random() * 100 + 1); // +1 car 100 est exclus, avec +1, intervalle [1;101[
		System.out.println(randomValues);

		Scanner scanner = new Scanner(System.in);
		int N = 0;

		System.out.println("Essayez de trouver la juste valeur ! :");
		int nb = scanner.nextInt();
		N++;

		while (nb != randomValues) {
			N++;
			System.out.println("Essayez encore ! :");
			nb = scanner.nextInt();
		}

		if (nb == randomValues) {
			System.out.println("Bravo, vous avez trouvé en " + N + " coups.");
		}

		scanner.close();
	}

}
