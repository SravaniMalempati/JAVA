
class Factorial
{
public static double factorial(int n)
{
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


public static double eulersNumber(int iterations)
{
double e=0;
double f=0;
for(int i=0;i<iterations;i++)
{

e =e+ (1/(factorial(i)));

}
return e;
}


public static void main(String[] args)
{
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
	
	
}
   
}