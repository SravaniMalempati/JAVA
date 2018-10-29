import java.lang.*;
import java.util.*;
class StuData
{
public static void main(String[] args)
{
Scanner s= new Scanner(System.in);
System.out.println("Enter the name");
String name =s.nextLine();
System.out.println("Enter the branch");
String br = s.nextLine();
System.out.println("Enter the rNo");
int rNo= s.nextInt();
System.out.println("Enter the per");
float per=s.nextFloat();
System.out.println("name=" +name);
System.out.println("br=" +br);
System.out.println("rno=" +rNo);
System.out.println("per=" +per);
}
}