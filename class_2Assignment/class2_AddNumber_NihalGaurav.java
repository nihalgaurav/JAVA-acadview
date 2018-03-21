
public class AddNumber {
	public static void main(String[] args) {
		int a=15,e;
		float b=10.23f,f;
		double c=55,g;
		byte d=92;
		g=(float)d+c;
		e=a+d;
		f=b+d;
		System.out.print("int e =(int+byte)");
		System.out.println(e);
		System.out.print("float f =(float+byte) ");
		System.out.println(f);
		System.out.print("double g =(byte+double) ");
		System.out.println(g);
		g=b+c;
		System.out.print("double g =(float+double) ");
		System.out.println(g);
		

	}

}
