package class_2Assignment;
public class Class2_ReverseNumber_NihalGaurav {
	public static void main(String[] args) {
		int num=25469,rem,rev=0;
		while(num/10>=1) {
			rem=num%10;
			rev=rev*10+rem;
			num=num/10;
		}
		rev=rev*10+num;
		System.out.println("reverse of the number is");
		System.out.println(rev);	
		
	}

}
