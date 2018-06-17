package class_5Assignment;
import java.util.Scanner;
public class Class5_Rectangle_NihalGaurav {
	int l,b;
	public static void main(String[] args) {
		Class5_Rectangle_NihalGaurav rc= new Class5_Rectangle_NihalGaurav();
		Scanner sc = new Scanner(System.in);
		System.out.println("enter l&b :");
		rc.l = sc.nextInt();
		rc.b = sc.nextInt();
		rc.CalculateArea(rc.l,rc.b);
		sc.close();
	}
	public void CalculateArea(int l,int b) {
		int temp = l*b;
		System.out.print("area is :" + temp);
		
	}

}
