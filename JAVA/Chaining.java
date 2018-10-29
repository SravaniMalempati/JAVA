class Chaining {
  protected String name;
  public int age;
  
  private static int DEFAULTAGE = 45;
  
  Chaining() {
    this("John Doe");
  }
  
  Chaining(String name) {
    this(name, DEFAULTAGE);
  }
  
  
  Chaining(String name, int age) {
    this.name = name;
    this.age = age;
  }
  
  
  
}