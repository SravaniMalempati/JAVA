 class DynamicStackTester {
  public static void main(String[] args) {
   
    DynamicStack list = new DynamicStack();
    list.push("10");
    list.push("20");
    list.push("30");
    list.push("40");
    System.out.println("List before pop:\n" + list.toString());
    System.out.println("Top element in the list before pop:\n " 
        + list.peek());
	list.pop();
    System.out.println("List after pop:\n" + list.toString());
    
    System.out.println("Top element in the list after pop:\n" +list.peek());
    list.push("67");
    
	System.out.println("Top element in the list before pop:\n " 
        + list.peek());
    System.out.println("List before pop:\n" + list.toString());
    list.pop();
    
  

  }
}