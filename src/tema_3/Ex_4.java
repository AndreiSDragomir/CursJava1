package tema_3;

import java.util.Scanner;

public class Ex_4 {
	
	public static void main(String[] args) {

		int numar; 
		int suma = 0;
		
		for (int i=0; i <= 9; i++) {
			System.out.println("Te rog sa introduci un numar");
			Scanner scan = new Scanner(System.in);
			numar = scan.nextInt();
			suma += numar;
		}
		
		System.out.println("Suma numerelor este: " + suma);

	}

}
