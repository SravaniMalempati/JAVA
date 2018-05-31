//Please Note that the modified code is represented by the tag "Modified codepart"

public class ListDeque<T> implements Deque<T> {
  Node first, last;
  int dlength;
  private String name;
  
      //Modified codepart
//Initialization	  
  public ListDeque() {
	  first = null;
	  last = null;
  dlength = 0;
  }
	  
  
  
  class Node {
    Node prev, next;
    T data;
    
    Node(T obj) {
      data = obj;
    }
    
  }//class node
  
 public void add(T element){
    Node n = new Node(element);
    if(last == null) {
      last = n;
      first = last;
    } else {
      last.next = n;
      n.prev = last;
      last = n;
    }
  }//add()
  
  
  
  //Modified codepart
 public T removeFirst(){
    T first_item = first.data;
	if(dlength == 1)
	{
		first = null;
		last = null;
	}//For One Element
	else
	{
	first = first.next;
	first.prev = null;
    }
	dlength--;
	return (T) first_item;
  }//if there are more elements in deque
  
    //Modified codepart
 public T removeLast(){
     Node p = last;
     last = last.prev;
     last.next = null;
     p.prev = null;
     return (T) p.data;
  }
  
    //Modified codepart
public  T peekFirst(){
     return (T) first.data;
  }
  
    //Modified codepart
  public T peekLast(){
     return last.data;
  }
  
  //Modified codepart
    @Override
  public String toString() {
	return " + name + ";
  }//tostring method implementation
  
}//class ListDeque


