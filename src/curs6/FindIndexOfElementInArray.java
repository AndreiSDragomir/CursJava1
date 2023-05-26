package curs6;

public class FindIndexOfElementInArray {

	/*
	 * avem un array si vrem sa aflam indexul unui anumit element
	 * ex: index pentru element 8 este 3
	 * rezolvam cu:
	 * FOR
	 * FOR EACH
	 * WHILE
	 * DO WHILE
	 * 
	 */
	
	static int[] numbers = {3, 5, 7, 8, 9, 2, 12};
	
	public static void main(String[] args) {
		System.out.println("________FOR_____________");
		rezolvareCuFor(8);
		System.out.println("________ForEach__________");
		rezolvareCuForEach(8);
		System.out.println("________While__________");
		rezolvareCuWhile(8);
		System.out.println("________DoWhile__________");
		rezolvareCuDoWhile(8);

	}
	
	public static void rezolvareCuFor (int element) {
		
		for (int i=0; i<numbers.length; i++) {
			if(numbers[i] == element) {
				System.out.println("index pentru " + element + " este" + i);
			}
		}
	}
	
	public static void rezolvareCuForEach(int number) {
		int i = 0;
		for (int element : numbers) {
			if(number == element) {
				System.out.println("index pentru " + element + " este" + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuWhile(int number) {
		
		int i = 0;
		while (i<numbers.length) {
			if(numbers[i]==number) {
				System.out.println("index pentru " + number + " este" + i);
			}
			i++;
		}
	}
	
	public static void rezolvareCuDoWhile(int number) {
		
		int i = 0;
		do {
			if(numbers[i]==number) {
				System.out.println("index pentru " + number + " este" + i);
			}
			i++;
		}while(i < numbers.length);
	}

}
