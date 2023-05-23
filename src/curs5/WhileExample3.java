package curs5;

import java.util.Scanner;

public class WhileExample3 {

	/*
	 * facem un program care calculeaza salariul pe o saptamana
	 * intrebam utilizatorul cate ore a lucrat
	 * calculam doar daca a lucrat minim o ora sau maxim 40
	 * daca introduce un nr invalid (0 sau 40+) il rugam sa introduca 
	 * iar pana ne da un numar valid de ore
	 * rate per hour
	 * 
	 */
	public static void main(String[] args) {
		int ratePerHour = 20;
		System.out.println("cate ore ai lucrat saptamana asta?");
		Scanner scan = new Scanner(System.in);
		int oreLucrate = scan.nextInt();
		
		while(oreLucrate < 1 || oreLucrate > 40) {
			System.out.println("numar invalid de ore");
			oreLucrate = scan.nextInt();
		}
		
		System.out.println("salariul tau este:" +oreLucrate*ratePerHour);
	}

}
