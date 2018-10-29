import java.util.*;
import java.lang.*;
class Calculator
{
public static void main(String[] args)
{
	 
	Scanner S=new Scanner(System.in);
	System.out.println(" Enter the operator");
	String operator=S.nextLine();
	
	Subclass a1=new Subclass();
	
	switch(operator)
	{
		case "+": a1.add();
		break;
		case "-": a1.sub();
		break;
		case "*": a1.multiplication();
		break;
		default: a1.division();
	}
	
}
}

	class Subclass
	{
		 int a=20;
	     int b=10;
	     int c;
		void add()
	{
		
		c=a+b;
		System.out.println(" the addition of two numbers is:" +c);
	}
	
	void sub()
	{
		 
		c=a-b;
		System.out.println("the subtraction of two numbers is:" +c);
	}
	
	void  multiplication()
	{
		
		c=a*b;
		System.out.println("the multiplication of two numbers is:" +c);
	}
	 void division()
	{
		 
		c=a/b;
		System.out.println("the division of two numbers is:" +c);
	}
	
}
	
	

