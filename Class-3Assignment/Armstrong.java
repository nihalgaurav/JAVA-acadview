
public class Armstrong {
	public static void main(String[] args) {
		int num=Integer.parseInt(args[0]);
		int temp=0,n=0,m=num,i;
		//finding the nummber of digits
		while(m>0) {
			n++;
			m=m/10;
		}
		m=num;
		//multiplying n times
		while(num>0) {
			i=num%10;
			int j=1;
			for(int k=0;k<n;k++)
				j=j*i;
			temp=temp+j;
			num=num/10;
		}
		if(temp==m)
			System.out.print("number is armstrong");
		else
			System.out.print("number is not armstrong");
		
	}

}
