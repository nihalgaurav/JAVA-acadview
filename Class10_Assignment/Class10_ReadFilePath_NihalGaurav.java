package Class10_Assignment;
import java.io.*;

public class Class10_ReadFilePath_NihalGaurav {
	public static void main(String[] args) throws IOException{
		File f = new File("C:\\Users\\nihal\\eclipse-workspace\\NihalProject1\\src\\abc.txt");
		System.out.println(f.createNewFile());
		System.out.println(f.exists());
		FileReader fr = new FileReader(f);
		FileWriter fw = new FileWriter(f);
		fw.write(f.getAbsolutePath());
		fw.flush();
		int c;
		while((c=fr.read())!=-1) {
			System.out.print((char)c);
		}
		fr.close();
		fw.close();
	}

}
