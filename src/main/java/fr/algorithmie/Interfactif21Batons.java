package fr.algorithmie;

import java.util.Arrays;
import java.util.Scanner;

public class Interfactif21Batons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// A finir
		
		Scanner scanner = new Scanner(System.in);

		int[] array = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

		int arrLength = array.length;
		while (arrLength > 0) {
			System.out.println("Veuillez choisir 1 à 3 bâtons: ");
			int nb = scanner.nextInt();

			if (nb < 1 || nb > 3) {
				System.out.println("Mauvaise instruction");
				continue;
			}

			arrLength -= nb;

			if (arrLength == 0) {
				System.out.println("Vous avez perdu la partie");
				break;
			}
			
			System.out.println("Bâtons restants : " + arrLength);
		}

		scanner.close();
		

		//A étudier
		// + math.random() pour le choix de l'ordinateur pour 1 à 3 bâtons
	
	while(!gameEnded)
	{
	    playerTurn();
	    computerTurn();
	};
	
	int counter = Math.random()*2;
	while(!gameEnded)
	{
	    if(counter%2 = 0)
	    {
	        playerTurn();
	        computerTurn();
	    }
	    if(counter%2 = 1)
	    {            
	        computerTurn();
	        playerTurn();
	    }
	    counter++;
	}
	
	}

}
