/* DynamicStack.java

   An interface for stacks.
   
   Sravani Malempati
   700662742
   CS4150, Spring, 2017 (Copus)
   
 */
//The properties of DynamicList class are Inherited by DynamicStack Class which is Implemented by Stack Interface
public class DynamicStack extends DynamicList implements Stack 
{
  
// Method for Inserting Element into the Stack.
   public void push(Object element) 
{
	addElement(element);
}//push()

//Method For Removing Element From the Top of the Stack
    public Object pop()
	{
		return removeLast();
    }//pop()
	
//Method which Returns Top Most Value of the Stack.
    public Object peek()
    {
       return getLastElement();
    }//peek()
	
} //class DynamicStack