public class LeibnizPi{
public static double LeibnizPi(int iterations)
{
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


public static void main(String[] args)
{
System.out.println("Leibniz Pi");
    System.out.println("         10 iterations " + LeibnizPi(10));
    System.out.println("        100 iterations " + LeibnizPi(100));
    System.out.println("      10000 iterations " + LeibnizPi(10000));
    System.out.println("  1 million iterations " + LeibnizPi(1000000));
    System.out.println(" 10 million iterations " + LeibnizPi(10000000));
    System.out.println("100 million iterations " + LeibnizPi(100000000));
	
}
}

