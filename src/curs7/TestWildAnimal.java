package curs7;

public class TestWildAnimal {

	public static void main(String[] args) {
		
		/*WildAnimal animal = new WildAnimal();
		animal.makeSound();
		System.out.println("________________________");
		Deer bambi = new Deer();
		bambi.makeSound();
		bambi.eatGrass();
		
		System.out.println("________________________");
		
		Lion simba = new Lion();
		simba.makeSound();
		simba.eatMeat();*/
		
		//WbDriver driver new ChromeDriver();
		
		/*
		 * WildAnimal este mostenit de catre Lion
		 * aici apare relatia Lion is an WildAnimal
		 * java imi permite sa fac obiectul Lion de tip
		 * WildAnimal, pentru ca Lion is an WildAnimal
		 */
		
		WildAnimal simba = new Lion();
		simba.makeSound();
		((Lion)simba).eatMeat();
		

	}

}
