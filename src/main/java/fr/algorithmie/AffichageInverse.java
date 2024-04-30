package fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array = { 1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4 };
		System.out.println(Arrays.toString(array));
		
		// affichage des éléments avec boucle for
		for (int i = 0; i < array.length; i++) {
		    System.out.println("normal: " + array[i]);
		}

		// affichage des éléments du tableau dans le sens inverse
		for (int i = 0; i < array.length; i++) {
		    System.out.println("inverse: " + array[array.length - 1 - i]);
		}
		
		// création d'une copie du tableau initial 
		
		int[] arrayCopy = array;

		System.out.println(Arrays.toString(arrayCopy));

	}

}
