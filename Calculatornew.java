class Calculatornew
{
	public static void main(String args[])
	{
		int a= Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		String c=args[2];
		
		
		switch(c)
		{
			case "+": 
			{
				 
			System.out.println(" The addition is :" +(a+b));
			}
			break;
			case "-":
			{
				
				System.out.println("The subtraction is :" +(a-b));
			}
			break;
			case "*":
			{
				
				System.out.println("The multiplication is " +(a*b));
				
			}
			break;
			case "/":
			{
				
				System.out.println("The division is" +(a/b));
			}
			break;
		}
	}
}
		