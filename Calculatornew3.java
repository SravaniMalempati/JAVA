class Calculatornew3
{
	public static void main(String args[])
	{
		int a= Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String c=args[2];
		int d;
		
		if(c.equals("+"))
		{
			d= a+b;
			System.out.println(" addition: " +d);
		}
	}
}