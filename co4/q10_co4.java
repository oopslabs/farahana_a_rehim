package co4;
import java.util.*;
public class q10_co4 {
	public static void main(String args[])
	{
		ArrayList<String>vehicles=new ArrayList<String>();
		vehicles.add("car");
		vehicles.add("bus");
		vehicles.add("truck");
		vehicles.add("bike");
		for(String str:vehicles)
		{
			System.out.println(str+" ");
		}
		vehicles.remove(1);
		vehicles.remove("car");
		System.out.println("after deletion");
		for(String str:vehicles)
		{
			System.out.println(str+" ");
		}
	}

}
