package curs1;
//one line comment

/*
 * 
 * multi line comment
 *
 */

//UpperCamelCase --> folosit la clase
//lowerCamelCase    //metodaMeaCareFaceLucruri --> folosit la metode
//in Python Snake case: metoda_mea_care_face_lucruri

public class Tester {
	//variabile
	private String nume; //se acceseaza doar din interiorul clasei
	public int ratePerHour; //se acceseaza si din exteriorul clasei
	
	//metoda: getter
	public String getNume() {
		return nume;
	}
	
	//metoda: setter
	public void setNume(String nume) {
		this.nume = nume;
	}
	
	//constructor
	//public Tester() {}
	
	public Tester(String nume, int rate) {
		setNume(nume);
		ratePerHour = rate;
		
	} 
	
	//Tester obj = new Tester();
	/*
	 * Tester --> Numele clasei
	 * obj --> nume obiect
	 * = --> operator de atribuire
	 * new --> cuvant cheie in java care ne ajuta sa instantiem o clasa
	 * Tester() --> constructor
	 */

	//Tester obj = new Tester();
	//obj.setNume("Oana");
}
