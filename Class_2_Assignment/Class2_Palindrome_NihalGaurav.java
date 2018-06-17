package class_2Assignment;
public class Class2_Palindrome_NihalGaurav {
	public static void main(String[] args) {
		int num,temp,rev=0,rem=0;
		num=101010101;
		temp=num;
		while(temp/10>=1) {
			rem=temp%10;
			rev=(rev*10)+rem;
			temp=temp/10;
		}
		rev=(rev*10)+temp;
		if(rev==num)
			System.out.println("the numbrer  is palindrome");
		else
			System.out.println("the number is not palindrome");
		
	}

}
