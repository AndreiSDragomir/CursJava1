package curs6;

import java.util.Scanner;

public class SwitchExample2 {
/*
 * verificam daca o litera este o vocala sau consoana
 * 
 */
	public static void main(String[] args) {
	
		
		Scanner scan = new Scanner(System.in);
		System.out.println("introdu o litera");
		char litera = scan.next().charAt(0);
		
		//a e i o u A E I O U
		
		switch(litera) {
		
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
		case 'A':
		case 'E':
		case 'I':
		case 'O':
		case 'U': 
			System.out.println("este vocala");
		break;
		default: 
			System.out.println("este consoana");
		}

	}

}
