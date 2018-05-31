interface A
{
	public void show();
	
}

class B implements A
{
	public void show()
	{
		System.out.println("Hello");
		}
	
	public void display()
	{
		System.out.println("Hi");
	}
}
public class Interfacesample {

	public static void main(String[] args) {
		A obj=new B();
		obj.show();
		

	}

}
