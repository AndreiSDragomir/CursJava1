package curs6;

public class ForEachExample {

	public static void main(String[] args) {
		String [] orase = {"iasi", "cluj", "brasov", "pitesti", "ploiesti"};
		//System.out.println(orase[1]);

		for (int i=0; i<orase.length;i++) {
			System.out.println(orase[i]);
		}
		System.out.println("__________________________");
		
		for(String element : orase) {
			System.out.println(element);
			
		}
		
	}

}
