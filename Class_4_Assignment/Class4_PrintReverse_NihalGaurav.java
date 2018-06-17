package Class_4Assignment;
public class Class4_PrintReverse_NihalGaurav {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int temp=0;
		while(num>0) {
			temp=(temp*10)+(num%10);
			num=num/10;
		}
		System.out.print(temp);
	}

}
