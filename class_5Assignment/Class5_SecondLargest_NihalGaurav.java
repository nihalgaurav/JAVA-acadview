package class_5Assignment;
import java.util.Scanner;
public class Class5_SecondLargest_NihalGaurav {
	public static void main(String[] args) {
		int[] a = new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 10 elements of array");
		for(int i=0;i<10;i++) {
			a[i]=sc.nextInt();
		}
		int larg=0,larg2=0;
		for(int i=0;i<10;i++) {
			if(a[i]>larg) {
				larg2=larg;
				larg=a[i];
			}
			if(a[i]<larg && a[i]>larg2)
				larg2=a[i];
		}
		System.out.println("second largets nuber in the array is :- ");
		System.out.println(larg2);
		sc.close();
	}

}
