package exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file1 {
public static void main(String args[])
{
	FileWriter fw;
	try {
		fw = new FileWriter("D:\\TKM\\oopslab\\hello.txt",true);
		fw.write("good morning");
		fw.close();
		FileReader fr=new FileReader("D:\\TKM\\oopslab\\hello.txt");
		BufferedReader br=new BufferedReader(fr);
		String line;
		while((line=br.readLine())!=null)
		{
			System.out.println(line);
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
	
}
}
