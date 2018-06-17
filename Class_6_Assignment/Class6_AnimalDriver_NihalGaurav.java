package Class_6Assignment;

public class Class6_AnimalDriver_NihalGaurav {
	public static void main(String[] args) {
		Class6_Animal_NihalGaurav a= new Class6_Animal_NihalGaurav();
		Class6_Dog_NihalGaurav d = new Class6_Dog_NihalGaurav();
		Class6_Cat_NihalGaurav c = new Class6_Cat_NihalGaurav();
		c.breed="bad cat";
		c.color="brown";
		d.breed="good dog";
		d.color="black and white";
		a.speak();
		d.speak();
		System.out.println("dog color : " + d.color);
		System.out.println("dog breed : " + d.breed);
		c.speak();
		System.out.println("cat breed : " + c.breed);
		System.out.println("cat color : " + c.color);
	}

}
