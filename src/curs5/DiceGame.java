package curs5;

import java.util.Scanner;

public class DiceGame {

	/*
	 * Facemun joc de zaruri care are urmatoarele reguli
	 * daca userul da in total 2 6 12 > pierde jocul > oprim
	 * daca userul da in total 3 7 ? castiga jocul > oprim
	 * daca usarul da in total 4 11 8 > repeta automat aruncarea
	 * daca daca oricare din variantele neenumerate mai sus
	 * atunci il intrebam daca vre sa mai joace
	 * raspunsul va fi un boolean: true sau false
	 * 
	 */
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		int dice1, dice2;
		boolean startJoc = true;

		while(startJoc) {
			
			dice1 = (int) (Math.random()*6+1);
			dice2 = (int) (Math.random()*6+1);
			int total = dice1 + dice2;
			System.out.println("Ai dat:" + total);
			
			if(total ==2 || total == 6 || total == 12) {
				System.out.println("Imi pare rau ai dat " + total + ". Ai pierdut!");
				startJoc = false;
			}else if(total==4 || total == 8 || total == 11) {
				System.out.println("Automat mai dai o data");
				
			}else if(total ==3 || total ==7) {
				System.out.println("Winner winner chicken dinner");
				startJoc = false;
				
			}else {
				System.out.println("Ai dat: " +total + ". Mai vrei sa joci?");
				startJoc = scan.nextBoolean();
			}
			
			
		}
		System.out.println("Game over!");
	}
}
