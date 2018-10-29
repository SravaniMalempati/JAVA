/*
  Primitive Types:
  
  byte -- 8-bit integer
  short -- 16 bit integer
  int  -- 32 bit integer, e.g. 1, -22, 0
  long  -- 64 bit integer
  
  float  --32 bit single precision floating point, e.g. 6.41, -0.375
  double   --64 bit double-precision floating point
  
  boolean  -- true or false
  
  char  -- one character, e.g. 'F', 'x', '6'
  
  Non-Primitive Types (Objects)
  
    String... not a primitive type!

*/

class Primitives {
  public static void main(String[] args) {
    
    double x;
    x = 12.0;
    x = 1.667e-23;
    
    int y = -11;
    y = 0x13AF9; //hexadecimal literal
    y = 0b0010; //binary literal
    
    char ch = 'a'; //always only one character
    
    ch = '\''; //others: '\n' = newline; '\\', backslash; '\"'
    
    // Variable scope: Variables are visible in the block in which they
    // are delcared, from the place they are declared, and in any block 
    // contained by that block
    if (x < 0) {
      String str = "Hello there!\nHow are you?";
      System.out.println(str);  
      for(int i = 0; i < 10; i++) {
        double k;
      }

    }//if
    
    //Type casting
    double a = 0.975;
    double b = 3.0;
    
    int x = (int)(b/a);
    
  }//main()
  
  
}//class 