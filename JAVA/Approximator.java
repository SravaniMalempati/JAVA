/*
    Sravani Malempati
    700662742
    Homework 2, Approximator.java
    CS 4150 (Copus), Spring 2017
*/

public class Approximator {
  
  /* liebnizPi()*/
   
  
  public static double leibnizPi(int iterations) {
  double pi=0;
  double denominator=1;
  for(int x=0;x<iterations; x++)
  {
  if(x%2==0)
  {
   pi=pi+(1/denominator);
  }
  else
  {
  pi=pi-(1/denominator);
  }
  denominator=denominator+2;
  }
   pi=pi*4;
   return pi;
  }

    
  
  /* factorial()*/
   
  public static double factorial(int n) {
    
	int i; 
	double fact=1;
	if(n==0)
		return 1;
	else
	{
	for(i=1;i<=n;i++)
	{
		fact=fact*i;
	}
	return fact;
	}
}
    
    
  
  /* eulersNumber()*/
   
  public static double eulersNumber(int iterations) {
    double e=0;
    double f=0;
    for(int i=0;i<iterations;i++)
    {

     e =e+ (1/(factorial(i)));

    }
    return e;
    }

    
   
  public static void main(String[] args) {
    System.out.println("Factorial");
    System.out.println("  Factorial of  0 is " + factorial(0));
    System.out.println("  Factorial of  5 is " + factorial(5));
    System.out.println("  Factorial of 10 is " + factorial(10));
    System.out.println();
    
    System.out.println("Euler's Number");
    System.out.println("   1 iteration  " + eulersNumber(1));
    System.out.println("   2 iterations " + eulersNumber(2));
    System.out.println("   5 iterations " + eulersNumber(5));
    System.out.println("  25 iterations " + eulersNumber(25));
    System.out.println("  50 iterations " + eulersNumber(50));
    System.out.println();
    
    System.out.println("Leibniz Pi");
    System.out.println("         10 iterations " + leibnizPi(10));
    System.out.println("        100 iterations " + leibnizPi(100));
    System.out.println("      10000 iterations " + leibnizPi(10000));
    System.out.println("  1 million iterations " + leibnizPi(1000000));
    System.out.println(" 10 million iterations " + leibnizPi(10000000));
    System.out.println("100 million iterations " + leibnizPi(100000000));
  } //main()
  
} //class Approximator