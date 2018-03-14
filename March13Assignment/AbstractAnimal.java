package March13Assignment;
abstract class AbstractAnimal {
	String[] color,breed,name;
	abstract void eat();
	void speak() {
		System.out.println("animal is speaking");
	}

}
