package curs4;

import java.util.Scanner;
public class LetterSearch {

	/*
	 * Facem un program care cere un text de la tastatura
	 * cautam in text litera a/A
	 * Daca o gasim, printam ca am gasit litera si de cate ori exista in text
	 * daca nu o gasim printam ca nu am gasit litera
	 */
	public static void main(String[] args) {
		
		System.out.println("Please enter a text:");
		Scanner scan = new Scanner(System.in);
		String text = scan.next();
		
		// masina masina.charAt(3) == i
		// 012345
		System.out.println(text.length());
		
		int counter = 0;
		for (int i=0; i<text.length(); i++) {
			if(text.charAt(i) == 'a' || text.charAt(i) == 'A') {
				counter++;
			}
		}
		
		String result = counter==0? "Letter was not found":"Letter was found" + counter;
		System.out.println(result);
		scan.close();
	}
	
	

}
