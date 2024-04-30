package fr.tableaux;

import java.util.Arrays;

public class ExerciceTableauChaines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] villesFr = {"Paris", "Bordeaux", "Couvertoirade", "St-Tropez", "Montpellier"};
		System.out.println(Arrays.toString(villesFr));
		villesFr[3] = "Reims";
		System.out.println(Arrays.toString(villesFr));
	}
}
