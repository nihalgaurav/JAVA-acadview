package class_5Assignment;

public class Class5_DisplayComplex_NihalGaurav {
	int real,img;
	public void display(int r,int i) {
		System.out.println(r + "+" + i + 'i');
	}
	public static void main(String[] args) {
		Class5_DisplayComplex_NihalGaurav n =new Class5_DisplayComplex_NihalGaurav();
		n.real=5;
		n.img=12;
		n.display(n.real,n.img);
	}

}
