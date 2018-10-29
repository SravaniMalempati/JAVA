import java.lang.*;
class Subclass
{
 int a=10;
void dis()
{
a++;

}
return(a);}
class MainClass6
{
 
public static int main(String[] args){

Subclass obj1=new Subclass();
Subclass obj2=new Subclass();
obj1.dis();
obj2.dis();
System.out.println(a);


}
}