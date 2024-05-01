package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class InteractifStockageNombre {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		int[] array = new int[0];

		while (true) {
			System.out.println("Veuillez choisir entre l'option 1 et 2: ");
			int nb = scanner.nextInt();
			
			switch (nb) {
			case 1 :
				System.out.print("Veuillez entrer une valeur: ");
				int newValue = scanner.nextInt();
				array = Arrays.copyOf(array, array.length+1);
				array[array.length -1] = newValue;
				break;
			case 2 : 
				System.out.println(Arrays.toString(array));
				break;
			default: 
				System.out.println("Mauvaise instruction");
				break;
			}

		}

	}
}
