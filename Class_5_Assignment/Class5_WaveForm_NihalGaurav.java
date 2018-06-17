package class_5Assignment;
import java.util.Arrays;
import java.util.Scanner;
public class Class5_WaveForm_NihalGaurav {
	public static void main(String[] args) {
		int[] arr= new int[10];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter 10 elements of array ");
		for(int i=0;i<10;i++) {
			arr[i]=sc.nextInt();
		}
		Arrays.sort(arr);
		int temp;
		for(int i=0;i<10;i+=2) {
			temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
		for(int i:arr) {
			System.out.print(i + " ");
		}
		sc.close();
	}

}
