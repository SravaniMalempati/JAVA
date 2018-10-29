/* DynamicList
   
   A variable-sized, array-based structure for storing objects.
   
   Sravani Malempati
   700662742
   CS4150, Spring, 2017 (Copus)
   
 */

public class DynamicList {
  private Object[] elements;
  private int numElements;
  private static int startSize = 4;
  
  public DynamicList(int startSize) { 
    elements = new Object[startSize];
    this.startSize = startSize;
    numElements = 0;
  }
  
  public DynamicList() {
    this(startSize);
  }
  
  public int addElement(Object element) {
    //add the element at the end of the elements array
    growSize();
    elements[numElements] = element;
    return numElements++;
  }
  
  public int addElement(Object element, int index) {
    //add the element at the indicated index, if valid
    // otherwise return -1, do nothing
    // loop from elements[numElements - 1] down to 
    //   elements[index], moving each one to the next cell
    if((index > numElements) || (index < 0)) {
      return -1;
    }
    growSize();
    for(int i = numElements - 1; i >= index; i--){
      elements[i+1] = elements[i];
    }
    elements[index] = element;
    numElements++;
    return index;
  }//addElement()
  
  public Object removeElement(int index) {
    //return null if invalid index
    if((index > numElements - 1) || (index < 0)) {
      return null;
    }
    Object rVal = elements[index];
    for(int i = index; i <= numElements - 1; i++) {
      elements[i] = elements[i+1];
    }
    numElements--;
    shrinkSize();
    return rVal;
  }//removeElement()
  
  public Object removeFirst() {
    if(numElements == 0) {
      return null;
    }
    Object rVal = elements[0];
    numElements--;
    for(int i = 0; i < numElements; i++) {
      elements[i] = elements[i+1];
    }
    shrinkSize();
    return rVal;
  }//removeFirst()
  
  public Object removeLast() {
    if(numElements == 0) {
      return null;
    }
    shrinkSize();
    return elements[--numElements];
  }//removeLast()
  
  public Object getElement(int index) {
    //returns a reference, but does not remove the object
    if((index > numElements - 1) || (index < 0)) {
      return null;
    }
    return elements[index];
  }//getElement()
  
  public Object getLastElement(){
	 if(numElements == 0) {
      return null;
    }
    else {
    return elements[numElements-1]; 
	}
  }
	  
	 
  private void growSize() {
    if(numElements < elements.length) {
      return;
    }
    //otherwise, double the size
    Object[] newArray = new Object[elements.length * 2];
    for(int i = 0; i < elements.length; i++) {
      newArray[i] = elements[i];
    }
    elements = newArray;
  }//growSize()
  
  private void shrinkSize() {
    //if structure is bigger than STARTSIZE and under half utilized
    // shrink by 50%
    if((numElements >= 0.5 * elements.length) || (elements.length <= startSize)) {
      return;
    }
    //otherwise, shrink by 50%
    Object[] newArray = new Object[elements.length / 2];
    for(int i = 0; i < numElements; i++) {
      newArray[i] = elements[i];
    }
    elements = newArray;
  }//shrinkSize()
  
  public int getNumberOfElements() {
    //how many elements in the array
    return numElements;
  }//getNumberOfElements()
  
  @Override
  public String toString() {
    String s = "";
    for(int i = 0; i < numElements; i++) {
      s = s + elements[i] + "\n ";
    }
    return s;
  }//toString()
 
} //class DynamicList