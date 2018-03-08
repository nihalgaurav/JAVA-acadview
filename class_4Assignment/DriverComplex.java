import java.util.Scanner;
public class DriverComplex {
	public static void main(String[] args) {
		int ch;
		Complex a=new Complex();
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("enter your choice :");
			System.out.println("1. add two complex number");
			System.out.println("2. multiply two complex number");
			System.out.println("3. exit");
			ch=sc.nextInt();
			switch(ch) {
				case 1: a.Setdata1();
						a.Setdata2();
						a.ComplexAdd();
						break;
				case 2: a.Setdata1();
				 		a.Setdata1();
				 		a.ComplexMult();
				 		break;
				case 3: System.exit(0);
					
			}
			sc.close();
		}
		
	}
}
