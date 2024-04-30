package fr.algorithmie;

import java.util.Arrays;
import java.util.Collections;

public class Rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer[] tab = {6, 3, 2, 6, 7, 4, 98, 6};
		
		Collections.rotate(Arrays.asList(tab), 1);
		System.out.println(Arrays.toString(tab));
		
		
	}

}
