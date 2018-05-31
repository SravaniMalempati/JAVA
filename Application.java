public class Application
{
public static void main(String[] args) throws XyzException
{

	Application.validateInputs(10,"","");


}

static void validateInputs(int age, String name, String emailaddress) throws XyzException
{
	
	if(age<18)
	{
		throw new XyzException("Minors not allowed");
	}
	else if(age>120)
	{
		throw new XyzException("Invalid age");
	}
}
}