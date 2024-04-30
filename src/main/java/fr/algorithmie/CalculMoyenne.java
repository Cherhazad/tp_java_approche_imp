package fr.algorithmie;

import java.util.Arrays; 

public class CalculMoyenne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
		double avg = Arrays.stream(array).average().getAsDouble();
		System.out.println("La valeur moyenne est: " + avg);

	}

}
