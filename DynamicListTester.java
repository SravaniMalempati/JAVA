class DynamicListTester{
  public static void main(String[] args){
    new DynamicListTester().test();
  }
  public void test(){
    DynamicList dl = new DynamicList();
    Square S1 = new Square(2.5);
    Square S2 = new Square(4.2);
    Square S3 = new Square(3.0);
    Square S4 = new Square(4.0);
    Square S5 = new Square(6.8);
    int one = dl.addElement(S1);
    int two = dl.addElement(S2);
    int three = dl.addElement(S3);
    int four = dl.addElement(S4);
    int five = dl.addElement(S5);
    int six = dl.addElement(S2,5);
    System.out.println(one+"\t"+two+"\t"+three+"\t"+four+"\t"+five+"\t"+six);
    Square S=(Square)dl.removeElement(5);
    System.out.println(S);
    int length = dl.getNumberOfElements();
    System.out.println(length);
    dl.removeFirst();
    dl.removeLast();
    Object c = dl.removeElement(2);
    Object d = dl.removeElement(3);
    System.out.println(c+"\t"+d);
    System.out.println("Before Shrinking = "+dl.getNumberOfElements());
    dl.shrinkSize();
    System.out.println("After Shrinking = "+dl.getNumberOfElements());
    int len1 = dl.getNumberOfElements();
    Square f = (Square)dl.getElement(1);
    System.out.println("After Shrinking Object: "+f);
    System.out.println(len1);
  }
}
    