/* CS4150, Week 3
   class Student
   
*/

class Student {
  
  long id; //700-number
  String lastName, firstName;
  double gpa; //grade point average
  int creditHoursAttempted;
  
  static long nextStudentId = 700690116;
  
  public Student(String firstName, String lastName) {
    this.lastName = lastName;
    this.firstName = firstName;
    gpa = 4.0;
    creditHoursAttempted = 0;
    id = nextStudentId++;
  }
  
  public String toString() {
    return "Student: " + id + " " + lastName + ", " + firstName 
        + " (GPA: " + gpa + "; hours attempted: " + creditHoursAttempted
        + ")";
  }
  
  public void addCourse(double creditHours, double gradePoints) {
    double priorGradePoints = creditHoursAttempted * gpa;
    double newGradePoints = priorGradePoints + gradePoints;
    creditHoursAttempted += creditHours;
    gpa = newGradePoints / creditHoursAttempted;
  }
  
  public static void main(String[] args) {
    
    Student s1 = new Student("Perry", "Copus");
    Student s2 = new Student("James", "Yasseh");
    Student s3 = new Student("John", "Bundor");
    Student s4 = new Student("Caleb", "Copus");
    
    s1.addCourse(3.0, 6.0);
    s2.addCourse(4.0, 16.0);
    s3.addCourse(3.0, 9.0);
    s4.addCourse(3.0, 12.0);
    
    System.out.println(s1);
    System.out.println(s2);
    System.out.println(s3);
    System.out.println(s4);
    
  }
  
}