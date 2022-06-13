package oopsexam;

import java.util.ArrayList;
import java.util.Scanner;

class stack<T>
{
	ArrayList<T> ar;
	int size,top=-1;
	stack(int size)
	{
		this.size=size;
		ar=new ArrayList<T>(size);
	}
	void push(T el)
	{
		if(top+1==size)
		{
			System.out.println("stack overflow");
		}
		else
		{
			top++;
			ar.add(el);
		}
	}
	void pop()
	{
		System.out.println("popped element is "+ar.get(top));
		ar.remove(top);
		top--;
		
	}
	void top()
	{
		System.out.println("top value is "+ar.get(top));
	}
	void display()
	{
		System.out.println("The elements are");
		for(T ob:ar)
		{
			
			System.out.println(ob);
		}
	}
}
public class stack_ex {
public static void main(String args[])
{
	int n,num;
	System.out.println("enter the size");
	Scanner sc=new Scanner(System.in);
	n=sc.nextInt();
	stack<Integer> s=new stack<Integer>(n);
	System.out.println("enter the elements");
	for(int i=0;i<n;i++)
	{	
		num=sc.nextInt();
		s.push(num);
	}
	s.display();
	s.pop();
	s.top();
	s.display();
}
}
