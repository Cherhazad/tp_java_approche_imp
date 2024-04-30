package fr.algorithmie;

public class AffichageSuite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		for (int i=1; i<=10; i++) {
			System.out.println(i);
		}
		

		for (int i=1; i<=10; i++) {
			if (i% 2 == 0) {
				System.out.println("pairs for: " + i);
			}
		}
		
		
		for (int i=1; i<10; i++) {
			if (i% 2 !=0) {
				System.out.println("impairs for: " + i);
			}
			
		}
		
		int i=1;
		while ( i<=10) {
			i++;
			if (i% 2 == 0) {
				System.out.println("pairs while: " + i);
			}
		}
		
		int a=0;
		while ( a<10) {
			a++;
			if (a% 2 != 0) {
				System.out.println("impairs while: " + a);
			}
		}
		
	}

}
