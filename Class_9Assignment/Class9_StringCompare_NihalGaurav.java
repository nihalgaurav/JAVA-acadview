package Class_9Assignment;
import java.util.*;
public class Class9_StringCompare_NihalGaurav {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("enter first string");
		String str1=sc.nextLine();
		System.out.println("enter second string");
		String str2=sc.nextLine();
		sc.close();
		if(str1.indexOf(str2)!=-1) {
			System.out.println("second string is found in first string");
		}else
			System.out.println("second String is not found in first string");
	}

}
