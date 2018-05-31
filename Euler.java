public class Euler
{
public static double eulersNumber(int iterations)
{
double e=0;
double f=1;
for(int i=0;i<iterations;i++)
{

e =e+ 1/f;

f++;
}
return e;
}
public static void main(String[] args)
{
System.out.println("Euler's Number");
    System.out.println("   1 iteration  " + eulersNumber(1));
    System.out.println("   2 iterations " + eulersNumber(2));
    System.out.println("   5 iterations " + eulersNumber(5));
    System.out.println("  25 iterations " + eulersNumber(25));
    System.out.println("  50 iterations " + eulersNumber(50));
    System.out.println();
}
}