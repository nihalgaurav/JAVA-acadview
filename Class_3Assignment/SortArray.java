package Class_3Assignment;
public class SortArray {
	public static void main(String[] args) {
		int[] A= {1,1,1,1,0,0,1,0};
		int n=0,i=0;
		for(int num : A) {
			if(num==0)
				n++;
			A[i]=1;
			i++;
		}
		for(i=0;i<n;i++)
			A[i]=0;
		for(int num : A)
			System.out.print(num);
	}
}
