package controlsttmnt;
import java.util.*;
public class q4_co1 {
	public static void main(String args[])
	{
		int s,flag;
		int a[][]=new int[50][50];
		int b[][]=new int[50][50];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of rows and cols (square matrix)");
		s=sc.nextInt();
		System.out.println("enter the elements in first matrix");
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				a[i][j]=sc.nextInt();
			}	
		}
		System.out.println("matrix");
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print(a[i][j]+" ");
			}	
			System.out.println();
		}
		System.out.println("transpose matrix");
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				b[i][j]=a[j][i];
			}	
		}
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				System.out.print(b[i][j]+" ");
			}	
			System.out.println();
		}
		flag=1;
		for(int i=0;i<s;i++)
		{
			for(int j=0;j<s;j++)
			{
				if(a[i][j]!=b[i][j])
				{
					flag=0;
					break;
				}
			}	
		}
		if(flag==1)
		{
			System.out.println("The matrix is symmetric");
		}
		else
		{
			System.out.println("The matrix is not symmetric");
		}
	}

}
