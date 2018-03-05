
public class ArraySearch {
	public static void main(String[] args) {
		int[] A= {1,4,6,7,8,9,10};
		int num=Integer.parseInt(args[0]),flag=0;
		for(int temp : A)
			if(temp==num) {
				System.out.print("number found in array");
				flag=1;
			}
		if(flag==0)
			System.out.print("number not found in array");
	}

}
