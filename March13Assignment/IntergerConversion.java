package March13Assignment;
import java.util.Scanner;
public class IntergerConversion {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		String num1,num2;
		System.out.println("enter two numbers");
		num1 = sc.nextLine();
		num2= sc.nextLine();
		int n1=Integer.parseInt(num1);
		int n2= Integer.parseInt(num2);
		System.out.println(n1);
		System.out.print(n2);
		sc.close();
	}
}
