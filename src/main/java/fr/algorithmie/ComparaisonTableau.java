package fr.algorithmie;

import java.io.*;
import java.util.Arrays;
import java.util.HashMap;

public class ComparaisonTableau {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] array1 = { 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4 };
		int[] array2 = { 3, -8, 17, 5, -1, 4, 0, 6, 2, 11, -5, -4, 8 };

		findCommonElements(array1, array2);

	}

	public static void findCommonElements(int array1[], int array2[]) {
		HashMap<Integer, Integer> hashMap = new HashMap<>();
		for (int i = 0; i < array1.length; i++) {
			if (hashMap.containsKey(array1[i])) {
				hashMap.put(array1[i], hashMap.get(array1[i]) + 1);
			} else {
				hashMap.put(array1[i], 1);
			}
		}

		for (int i = 0; i < array2.length; i++) {
			if (hashMap.containsKey(array2[i])) {
				hashMap.remove(array2[i]);
				/*
				 * remove common elements from hashmap to avoid duplicates
				 */
				System.out.print(array2[i] + " ");
			}
		}
	}
}
