public class VirtualDemo {

   public static void main(String [] args) {
      Salary s = new Salary("sravani", "Warrensburg",3,3600.00);
      
      Employee e = new Salary("sowjanya","warrensburg",2,2300.00);
	  
      System.out.println("Call mailCheck using Salary reference --");   
      s.mailCheck();
      System.out.println("\n Call mailCheck using Employee reference--");
      e.mailCheck();
   }
}