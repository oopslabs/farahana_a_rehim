package controlsttmnt;
import java.util.*;
public class q2_co1 {

	public static void main(String args[])
	{
	int r,c;
	int a[][]=new int[50][50];
	int b[][]=new int[50][50];
	int s[][]=new int[50][50];
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the number of rows");
	r=sc.nextInt();
	System.out.println("enter the number of columns");
	c=sc.nextInt();
	System.out.println("enter the elements in first matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			a[i][j]=sc.nextInt();
		}
		
	}
	System.out.println("first matrix:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(a[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("enter the elements in second matrix");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			b[i][j]=sc.nextInt();
		}
		
	}
	System.out.println("second matrix:");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			System.out.print(b[i][j]+" ");
		}
		System.out.println("");
	}
	System.out.println("Matrix addition");
	for(int i=0;i<r;i++)
	{
		for(int j=0;j<c;j++)
		{
			s[i][j]=a[i][j]+b[i][j];
			System.out.print(s[i][j]+" ");
		}
		System.out.println("");
	}
	}
}
