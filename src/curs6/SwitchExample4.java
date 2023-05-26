package curs6;

import java.util.Scanner;

public class SwitchExample4 {

	public static void main(String[] args) {
/*
 * Facem un program care verifica daca un student este eligibil de bursa
 * cu conditiile:
 * 
 * 
 */

		Scanner scan = new Scanner(System.in);
		System.out.println("introdu anul");
		int an = scan.nextInt();
		//System.out.println("introdu punctaj");
		int punctaj; // = scan.nextInt();
		
		switch(an) {
		case 3:
			System.out.println("introdu punctaj");
			punctaj = scan.nextInt();
			switch(punctaj) {
			case 80:
				System.out.println("eligibil bursa 1");
				break;
			case 50:
				System.out.println("eligibil bursa 2");
				break;
			default:
				System.out.println("Nu esti eligibil");
					
			}
		
		}
	}

}
