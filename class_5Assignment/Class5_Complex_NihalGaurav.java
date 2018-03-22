package class_5Assignment;
import java.util.Scanner;
public class Class5_Complex_NihalGaurav {
	int Num1Real,Num1Img,Num2Real,Num2Img;
	String num1,num2;
	Class5_Complex_NihalGaurav(){
//		num1=null;
//		num2=null;
//		Num1Real=null;
//		Num1Img=null;
//		Num2Real=null;
//		Num2Img=null;
	}
	
	public void SplitNumber(String number1,String number2) {
		//splitting number1
		String[] num1=number1.split("+");
		this.Num1Real = Integer.parseInt(num1[0]);
		String[] num1_img = num1[1].split("i");
		this.Num1Img = Integer.parseInt(num1_img[0]);
		//splitting number2
		String[] num2=number2.split("+");
		this.Num2Real = Integer.parseInt(num2[0]);
		String[] num2_img = num1[1].split("i");
		this.Num2Img = Integer.parseInt(num2_img[0]);
		
	}
	public void Setdata1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first complex number :");
		this.num1=sc.nextLine();
		sc.close();
		
	}
	public void Setdata2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter secound complex number :");
		this.num2=sc.nextLine();
		sc.close();
	}	
	public void ComplexAdd() {
		SplitNumber(this.num1,this.num2);
		int real = this.Num1Real + this.Num2Real;
		int img = this.Num1Img + this.Num2Img;
		System.out.println("the sum of complex number entered is :" + real + "+" + img);
	}
	public void ComplexMult() {
		SplitNumber(this.num1,this.num2);
		int real = (this.Num1Real*this.Num2Real)-(this.Num1Img*this.Num2Img);
		int img = (this.Num1Img*this.Num2Real)+(this.Num1Real*this.Num2Img);
		System.out.print("multiplication of complex numbers is :" + real + "+" + img);
	}
	
}
