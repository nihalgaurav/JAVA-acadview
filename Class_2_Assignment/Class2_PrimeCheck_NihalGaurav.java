package class_2Assignment;
public class Class2_PrimeCheck_NihalGaurav {
	public static  void  main(String[] args) {
		int i,num=119,flag=0;
		for(i=2;i<num;i++)
		{
			if(num%i==0) {
				flag=1;
				System.out.println(i);
			}
		}
		if(flag==1)
			System.out.println("its not a prime number");
		else
			System.out.println("its a prime number");
	}

}
