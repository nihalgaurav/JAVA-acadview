package Class_6Assignment;

public class Class6_PrintOverload_NihalGaurav {
	static void print(){
		System.out.println("print function with no argument");
	}
	static void print(int a) {
		System.out.println("print function with integer argument");
	}
	static void print(char c) {
		System.out.println("print function with character argument");
	}
	public static void main(String[] args) {
		print('c');
		print();
		print(2);
	}

}
