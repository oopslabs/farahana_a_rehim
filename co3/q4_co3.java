package co3lab;

import java.util.Scanner;

class publisher
{
	String pid,pname;
	publisher()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter publisher id");
		pid=sc.nextLine();
		System.out.println("Enter publisher name");
		pname=sc.nextLine();
		
	}
}
class book extends publisher
{
	String bid,bname;
	book()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book id");
		bid=sc.nextLine();
		System.out.println("Enter book name");
		bname=sc.nextLine();
		
	}
	
}
class fiction extends book
{
	String fid,fname;
	fiction()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter fiction id");
		fid=sc.nextLine();
		System.out.println("Enter fiction name");
		fname=sc.nextLine();
	}
	void display()
	{
		System.out.println("publisher id: "+pid);
		System.out.println("publisher name: "+pname);
		System.out.println("book id: "+bid);
		System.out.println("book name: "+bname);
		System.out.println("fiction id: "+fid);
		System.out.println("fiction name: "+fname);
	}
}
class literature extends book
{
	String lid,lname;
	literature()
	{
		super();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter literature id");
		lid=sc.nextLine();
		System.out.println("Enter literature name");
		lname=sc.nextLine();
	}
	void display()
	{
		System.out.println("publisher id: "+pid);
		System.out.println("publisher name: "+pname);
		System.out.println("book id: "+bid);
		System.out.println("book name: "+bname);
		System.out.println("literature id: "+lid);
		System.out.println("literature name: "+lname);
		
	}
}
public class q4_co3 {
public static void main(String args[])
{
	publisher p=new publisher();
	book b=new book();
	fiction f1=new fiction();
	f1.display();
	literature l=new literature();
	l.display();
}
}
