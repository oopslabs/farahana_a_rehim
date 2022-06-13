package oopsexam;
import java.util.Random;
import java.util.Scanner;
class odd extends Thread
{
	int o;
	odd(int o)
	{
		this.o=o;
	}
	public void run()
	{
		int s;
		s=o*o*o;
		System.out.println("odd number cube "+s);
	}
}
class even extends Thread
{
	int e;
	even(int e)
	{
		this.e=e;
	}
	public void run()
	{
		int s;
		s=e*e;
		System.out.println("even number square "+s);
	}
}
class random_ex extends Thread
{
	public void run()
	{
		int n,temp;
		double temp1;
		int ar[]=new int[50];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number of elements");
		n=sc.nextInt();
		System.out.println("enter the  elements");
		for(int i=0;i<n;i++)
		{
			ar[i]=sc.nextInt();
		}
		System.out.println("elements are");
		for(int i=0;i<n;i++)
		{
			
			System.out.println(ar[i]);
		}
		for(int i=0;i<n;i++)
		{
			//temp1=Math.random();
			temp=ar[i];
			if(temp%2==0)
			{
				even e=new even(temp);
				e.start();
				try {
					e.sleep(2000);
				} catch (InterruptedException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
			else
			{
				odd o=new odd(temp);
				o.start();
			}
		}
		
	
	}
	
}


public class multithread {
	public static void main(String args[]) {
	random_ex r=new random_ex();
	r.start();
	
	}
}

