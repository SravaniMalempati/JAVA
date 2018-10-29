 class ListDequeTester {
   
   static class Thing {
     static int nextNumber = 1;
     String name;
     int number;
     
     Thing() {
       number = nextNumber++;
       name = "Thing#" + number;
     }
     
    public  String toString() {
       return "Hello, I am " + name;
     }
   }//class Thing
   
   
   
   public static void main(String[] args) {
     ListDeque<Thing> deque = new ListDeque<>();
     deque.add(new Thing());
     System.out.println("First Element is added which says:   \n " + deque.peekFirst());//First element is added
     deque.add(new Thing());
     System.out.println("Second Element is added which says:   \n " + deque.peekLast());// Second element is added
     deque.add(new Thing());
     System.out.println("Third element is added which says:\n " + deque.peekLast());// Third element is added
     deque.add(new Thing());
     System.out.println("Fourth element is added which says:\n " + deque.peekLast());//Fourth element is added
     deque.removeLast();
     System.out.println("Last Element is removed and new last element is \n" + deque.peekLast());//Last element is removed
     deque.removeFirst();
     System.out.println("First Element is removed and new First element says \n" + deque.peekFirst());//First element is removed
     deque.removeLast();
     System.out.println("Last Element is removed and new last element is \n" + deque.peekLast());//the updated last element is removed 
     System.out.println("Now the Only element present which is both the first and last and it says: \n" + deque.peekFirst()); //Only the second element is displayed
     Thing t = deque.removeLast();
    
     ListDeque<Integer> intDeque = new ListDeque<Integer>();
     
     
   }
 }