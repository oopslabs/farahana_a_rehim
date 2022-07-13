package exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {
	public static void main(String args[])
	{
		try {
			FileWriter fw= new FileWriter("D:\\TKM\\oopslab\\test.txt",true);
			FileReader fr=new FileReader("D:\\TKM\\oopslab\\hello.txt");
			BufferedReader br=new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null)
				fw.write(line);
			fw.close();
			fr.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
