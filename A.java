public class A
{
public static void main(String[] args){
System.out.println("A main");
m1();
}
public static void m1(){
System.out.println("A m1()");
main(new String[0]);
System.out.println("A m1()"); 
 System.out.println("A m1()"); 
 
}
}
