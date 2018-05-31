class TriangleTester {
  public static void main(String[] args) {
    Triangle tri = new Triangle(12.0, 5.0);
    Triangle tri2 = new Triangle(2.0, 5.0);
    
    Triangle tri3 = tri2;
    
    System.out.println(tri);
    System.out.println(tri2);
    System.out.println(tri3);
    
    tri3.scale(10.0);
    
    System.out.println(tri);
    System.out.println(tri2);
    System.out.println(tri3);

  } //main()
}