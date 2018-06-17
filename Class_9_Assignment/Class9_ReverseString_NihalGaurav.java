package Class_9Assignment;
//import java.io.*;
//import java.util.*;
public class Class9_ReverseString_NihalGaurav {
	public static void main(String[] args){
		String str="nihal gaurav";
		System.out.println(str);
		StringBuilder str1= new StringBuilder();
		str1.append(str);
		str1=str1.reverse();
		System.out.println(str1);
		
	}
}