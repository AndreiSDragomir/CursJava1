package tema_2;

import java.util.Scanner;

public class Exercitiu3 {

	public static void main(String[] args) {
	
		int ziua;
		
		System.out.println("Ce zi este astazi?");
		Scanner scan = new Scanner(System.in);
		ziua = scan.nextInt();
		
		if (ziua == 0) {
			System.out.println("Te rog sa introduci un numar mai mare ca 0");
		}else if (ziua == 1) {
			System.out.println("Astazi este luni");
		}else if (ziua == 2) {
			System.out.println("Astazi este marti");
		}else if (ziua == 3) {
			System.out.println("Astazi este miercuri");
		}else if (ziua == 4) {
			System.out.println("Astazi este joi");
		}else if (ziua == 5) {
			System.out.println("Astazi este vineri");
		}else if (ziua == 6) {
			System.out.println("Astazi este sambata");
		}else if (ziua == 7) {
			System.out.println("Astazi este duminica");
		}else {
			System.out.println("Saptamana are doar 7 zile. Te rog sa introduci un numar valid");
	}
	}
		
	}

