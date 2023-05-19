package curs4;

public class Palindrom {

	public static void main(String[] args) {
		
		checkPalindrom("radar");

	}

	public static void checkPalindrom(String cuvant) {
		String cuvant2="";
		
		for (int i=cuvant.length()-1;i>=0;i--) {
			cuvant2 = cuvant2 + cuvant.charAt(i);
		}
		
		String result = cuvant2.equals(cuvant) ? "este" : "nu este";
		System.out.println(result);	
	}
}
