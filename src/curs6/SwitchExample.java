package curs6;

import java.util.Scanner;

public class SwitchExample {
	/*
	 * 
	 * intrebam userul un calificativ
	 * in functie de calificativ printam
	 * a felicitari
	 * b destul de bine
	 * c suficient
	 * d insuficient
	 * daca introduce alt calificativ printam "calificativ invalid"
	 */
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Te rog introdu un calificativ");
		String calificativ = scan.next();
		
		switch(calificativ) {
		case "a":
			System.out.println("felicitari");
			break;
		case "b":
			System.out.println("destul de bine");
			break;
		case "c":
			System.out.println("suficient");
			break;
		case "d":
			System.out.println("insuficient");
			break;
		default:
			System.out.println("calificativ invalid");
		}

	}

}
