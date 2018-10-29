class Triangle {
  private double base, height;
  
  public Triangle(double base, double height) {
    this.base = base;
    this.height = height;
  }
  
  public double getBase() {
    return base;
  }
  
  public double getHeight() {
    return height;
  }
  
/*  
  public void setBase(double b) {
    base = b;
  }
  
  public void setHeight(double h) {
    height = h;
  }
*/
  
  public double getArea() {
    return 0.5 * base * height;
  }
  
  public void scale(double scaleFactor) {
    base *= scaleFactor;
    height *= scaleFactor;
  }
  
  public String toString() {
    String rval = "Triangle: base = " + base +
        " and height = " + height + "; area = " + getArea();
    return rval;
  }
public static void main(String[] args)
{
	Triangle t1= new Triangle(2,3);
	Triangle t2= new Triangle(4,5);
	Triangle t3= new Triangle(3.5,5);
	t1.scale(3);
	t2.scale(4);
	t3.scale(5);
	System.out.println(t1);
	System.out.println(t2);
	System.out.println(t3);
	
}
   
} //class Triangle