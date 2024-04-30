package fr.algorithmie;

public class AffichagePartiel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		// affiche que les éléments supérieurs à 3
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] > 3) {
			System.out.println("sup à 3: " + array[i]);
			}
		}
		
		// Affiche que les entiers pairs
		
		for (int i = 0; i<array.length; i++) {
			if (array[i] % 2 == 0) {
				System.out.println("pairs:" + array[i]);
			}
		}
		
		// Afficher les valeurs dont les indexs sont pairs
		
		for (int i=0; i<array.length; i++) {
			if (i % 2 == 0) {
				System.out.println("index pairs:" + array[i]);
			}
		}
		
		// afficher que les entiers impairs
		
		for (int i=0; i<array.length; i++) {
			if (array[i] % 2 != 0) {
				System.out.println("impairs:" + array[i]);
			}
		}
	}

}
