import java.lang.*;
import java.util.*;
class sample9
{
int m,n,x;
public void trash(int x)
{
	

m=0;
if(x > 0)
m=4;
if(x > 5)
n= 3*m;

System.out.println("m is: " +m);
System.out.println("n is: " +n);
}
}




class sample11
{
public static void main(String[] args)
{
sample9 obj1 = new sample9();
obj1.x=20;
obj1.trash();	


}
}