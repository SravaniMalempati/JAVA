import java.util.*;
class Subclass
{
Subclass(int x,int y,int z)
{

System.out.println("The val z=" +z);
}
Subclass(int x,int y)
{

System.out.println("The val y="+y);
}
Subclass(int x)
{System.out.println("The val x=" +x);
}}
class DemoCon8
{public static void main(String[] args)
{
Scanner s = new Scanner(System.in);
System.out.println("Enter the val of x");
int x=s.nextInt();
System.out.println("Enter the val of x");
int y=s.nextInt();
System.out.println("Enter the val of x");
int z=s.nextInt();
Subclass obj=new Subclass(x,y,z);
}}