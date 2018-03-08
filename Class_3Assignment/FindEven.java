package Class_3Assignment;
public class FindEven {
	public static void main(String args[]) {
		int num;
		num=Integer.parseInt(args[0]);
		for(int n=num;n>1;n--) {
			if(n%2==0)
				System.out.println(n);
		}
	}

}
