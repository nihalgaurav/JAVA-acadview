package Class_9Assignment;

public class Class9_CountTheWords_NihalGaurav {
	public static void main(String[] args) {
		String str="hi i'm nihal gaurav aa java programmer";
		int count=1;
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i) == ' ' &&  str.charAt(i+1)!=' ')
			count++;
		}
		System.out.println(count);
	}

}
