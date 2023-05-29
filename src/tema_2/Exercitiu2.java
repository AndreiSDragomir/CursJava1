package tema_2;

import java.util.Scanner;

public class Exercitiu2 {

	public static void main(String[] args) {

			int punctaj;
			
			System.out.println("Care este punctajul obtinut?");
			Scanner scan = new Scanner(System.in);
			punctaj = scan.nextInt();
			
			if (punctaj >= 0 && punctaj <= 65) {
				System.out.println("Ai picat. Mai incearca");
			}else {
				if (punctaj >= 66 && punctaj <= 100) {
					System.out.println("Felicitari, ai trecut");
				}else {
					System.out.println("Punctaj invalid");
				}
			}

	}

}
