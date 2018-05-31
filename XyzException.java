public class XyzException extends Exception
{
if (age<18)
	throw new XyzException("Minors not allowed");
else if(age>120)
	throw new XyzException("invalid age");
XyzException(String msg)
{
	super(msg);
}
}
