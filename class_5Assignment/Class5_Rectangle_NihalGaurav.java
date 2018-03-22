package class_5Assignment;
import java.util.Scanner;
public class Class5_Rectangle_NihalGaurav {
	public static void main(String[] args) {
		int l,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter l&b :");
		l = sc.nextInt();
		b = sc.nextInt();
		CalculateArea(l,b);
		sc.close();
	}
	public static void CalculateArea(int l,int b) {
		int temp = l*b;
		System.out.print("area is :" + temp);
		
	}

}
