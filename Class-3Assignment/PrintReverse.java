
public class PrintReverse {
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
