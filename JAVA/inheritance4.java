class SuperClass
{
void m(int x)
{

System.out.println("sUPERCLASSS");
System.out.println("The val x="+x);
}
}
class Subclass extends SuperClass
{
void m(int x, int y)
{
	
System.out.println("Subclass");
System.out.println("The val x=" +x);
System.out.println("The val y=" +y);
}}
class inheritance4
{
public static void main(String[] args)
{
Subclass obj=new Subclass();
obj.m(11);
}}