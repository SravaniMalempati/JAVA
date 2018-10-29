public class egStatic {
 static int x = 60;
  static void fun() {
  System.out.println("Within Static");
 }
 public static void main(String[] args) {
	 
  egStatic.fun();
  System.out.println(x);
  
  
 }
}
