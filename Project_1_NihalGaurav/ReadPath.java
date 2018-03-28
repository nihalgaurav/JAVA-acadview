package Project_1_NihalGaurav;
import java.io.*;
import java.util.*;
public class ReadPath {
	ArrayList<String> list = new ArrayList<String>();
	
	//function to read file and folder and save it into list
	public void ReadList(File fl) throws IOException{
		File[] file;
		file=fl.listFiles();
		
		//reading each element of parent directory
		for(File f: file) {
			if(f.isDirectory()) {
				// if folder found save in list and recursive call
				list.add("Directory :" + f.getName());
				ReadList(f);
			}
			else {
				//if file found put in list
				list.add("  File :" + f.getName());
			}
			
		}

		//printing list containing file and folder
		 for (int i=0; i<list.size(); i++)
	            System.out.print(list.get(i)+"\n");
	}
	public void GenerateCvs(String s) throws IOException{
		//writing cvs file 
		System.out.println(s);
		FileWriter fw= new FileWriter(s);
		for(int i=0; i<list.size();i++) {
			fw.append(list.get(i));
			fw.append("\n");
		}
		System.out.println(".....cvs file generated sucessfully.......");
		fw.flush();
		fw.close();
	}
	
}
 