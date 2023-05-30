package curs7;

public class TestShape {
	
	public static void main (String[] args) {
		
		Patrat patrat = new Patrat("Cerc", "Galben");
		System.out.println(patrat.nume);//printeaza obiectul clasei Patrat
		System.out.println(patrat.culoare);//printeaza obiectul clasei Patrat
		
		patrat.printDetails();//printeaza obiectul clasei Shape pentru ca are referinta super in fata variabilelor
	
	/*
	 * valorile setate in constructor se duc prin referinta super din
	 * constructor direct in obiectul din clasa parinte(Shape)
	 * 
	 */
	
	}

}
