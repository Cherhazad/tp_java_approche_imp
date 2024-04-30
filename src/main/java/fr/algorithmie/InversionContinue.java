package fr.algorithmie;

import java.util.Arrays;

public class InversionContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		
		
		// création d'une copie dans l'ordre inversé du tableau initial 
		int[] arrayCopy = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			arrayCopy[i] = array[array.length - 1 - i];
		}

		// affichage de l'ensemble des éléments des 2 tableaux
		System.out.println(Arrays.toString(array) + Arrays.toString(arrayCopy));

	}
}
