package externalexam;

import java.util.Scanner;

class methods
{
	int a,b;
	methods(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	void add()
	{
		System.out.println("Sum is "+(a+b));
	}
	void sub()
	{
		System.out.println("Difference is "+(a-b));
	}
	void multiply()
	{		
		System.out.println("Product is "+(a*b));
	}
	void divide()
	{
		System.out.println("Remainder is "+(a/b));
	}
}
public class calculator {
public static void main(String args[])
{
	int v1,v2,ch;
	int op;
	Scanner sc=new Scanner(System.in);
	do{
	System.out.println("Enter first number");
	v1=sc.nextInt();
	System.out.println("Enter second number");
	v2=sc.nextInt();
	methods m=new methods(v1,v2);
	
	System.out.println("Menu\n1.Add\n2.Subtract\n3.Multiply\n4.Divide\nEnter your choice");
	ch=sc.nextInt();
	switch(ch)
	{
		case 1: m.add();
				break;
		case 2: m.sub();
				break;
		case 3: m.multiply();
				break;
		case 4: m.divide();
				break;
		default: System.out.println("wrong choice");
			
	}
	System.out.println("Do you want to continue?(1/0)");
	op=sc.nextInt();
	}while(op!=0);
	System.out.println("Exit!!");
}
}
