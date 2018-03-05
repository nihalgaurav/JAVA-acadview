
public class FindPrime {
	public static void main(String[] args) {
		int num=9,i,j; 
		num=Integer.parseInt(args[0]);
		outer: for(i=num;i>1;i--) {
			for(j=2;j<i;j++) {
				if(i%j==0)
					continue outer ;
			}
			System.out.println(i);
		}
	}

}
