import java.util.Scanner;
public class SwitchExample{
public static int main(String[] args)
{

Scanner s = new Scanner(System.in);
System.out.println(" Enter the roll number");
int rno =s.nextInt();

switch(rno)
{
case 1: 
System.out.println("I am java student");

default:
System.out.println("no student found");

case 2:
System.out.println("I am dot net student");

case 3:
System.out.println("I am java students");
break;


}
}
}