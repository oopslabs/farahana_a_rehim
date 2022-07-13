package exam;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file3 {
public static void main(String args[])
{
	try {
		FileReader fr=new FileReader("D:\\TKM\\oopslab\\test.txt");
		FileWriter fw1=new FileWriter("D:\\TKM\\oopslab\\odd.txt",true);
		FileWriter fw2=new FileWriter("D:\\TKM\\oopslab\\even.txt",true);
		BufferedReader br=new BufferedReader(fr);
		int i;
		while((i=br.read())!=-1)
		{
			if(i%2==0)
			{
				fw2.write(i);
			}
			else
			{
				fw1.write(i);
			}
		}
		
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	
}
}
