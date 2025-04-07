// // CyberMatrix class definition
// class CyberMatrix {
//     private int width, height;
//     private String color, backgroundColor;

//     // Default Constructor
//     public CyberMatrix() {
//         this.width = 10;
//         this.height = 10;
//         this.color = "white";
//         this.backgroundColor = "black";
//     }

//     // Parameterized Constructor
//     public CyberMatrix(int width, int height, String color, String backgroundColor) {
//         this.width = width;
//         this.height = height;
//         this.color = color;
//         this.backgroundColor = backgroundColor;
//     }

//     // Copy Constructor
//     public CyberMatrix(CyberMatrix other) {
//         this.width = other.width;
//         this.height = other.height;
//         this.color = other.color;
//         this.backgroundColor = other.backgroundColor;
//     }

//     // Method to calculate area
//     public void calculateArea() {
//         int area = width * height;
//         System.out.println("------------------------");
//         System.out.println("Rectangle Area: " + area);
//     }

//     // Method to display details
//     public void displayDetails() {
//         System.out.println("Width: " + width);
//         System.out.println("Height: " + height);
//         System.out.println("Color: " + color);
//         System.out.println("Background Color: " + backgroundColor);
//     }
// }

// // Main class to demonstrate the usage of CyberMatrix
// public class lab {
//     public static void main(String[] args) {
//         System.out.println("Default Constructor:");
//         CyberMatrix s1 = new CyberMatrix();
//         s1.calculateArea();
//         s1.displayDetails();

//         System.out.println("\nParameterized Constructor:");
//         CyberMatrix s2 = new CyberMatrix(20, 30, "blue", "gray");
//         s2.calculateArea();
//         s2.displayDetails();

//         System.out.println("\nCopy Constructor:");
//         CyberMatrix s3 = new CyberMatrix(s2);
//         s3.calculateArea();
//         s3.displayDetails();
//     }
// }


// import java.time.LocalDate;

// class Students {
   
//     private String name;
//     private int age;
//     private String grade;
//     private String studentID;
//     private LocalDate joiningDate; 

//     public Students(String name, int age, String grade, String studentID, LocalDate joiningDate) {
//         this.name = name;
//         this.age = age;
//         this.grade = grade;
//         this.studentID = studentID;
//         this.joiningDate = joiningDate;
//     }

//     public void displayDetails() {
//         System.out.println("Student Details:");
//         System.out.println("Name: " + name);
//         System.out.println("Age: " + age);
//         System.out.println("Grade: " + grade);
//         System.out.println("Student ID: " + studentID);
//         System.out.println("Joining Date: " + joiningDate);
//         System.out.println("----------------------");
//     }

//     public static void main(String[] args) {
//         Students student1 = new Students("Rock", 18, "12th Grade", "S1001", LocalDate.of(2023, 9, 1));
//         Students student2 = new Students("Dom", 19, "College Freshman", "S1002", LocalDate.of(2022, 8, 15));

//         student1.displayDetails();
//         student2.displayDetails();
//     }
// }

// class Student {
//     private int id;
//     private String name;
//     private int age;
//     private int courseCount;
//     private Course[] courses;

//     // Constructor
//     public Student(int id, int age, String name,int maxSize) {
//         this.id = id;
//         this.age = age;
//         this.name = name;
//         this.courseCount = 0;
//         this.courses = new Course[maxSize];

//     }

  
//      public void enrollCourse(Course course) {
//         if (courseCount < courses.length) {
//             courses[courseCount] = course;  // Add course to array
//             courseCount++;
//             System.out.println(name + " has enrolled in " + course.getTitle());
//         } else {
//             System.out.println(name + " cannot enroll in more courses. Limit reached.");
//         }
//     }
//     // Method to display student information
//     public void displayStudentInfo() {
//         System.out.println("ID: " + id);
//         System.out.println("Age: " + age);
//         System.out.println("Name: " + name);
//         System.out.println("----------------------");
//         for(int i = 0; i < courseCount; i++) {
//             System.out.println(" - " + courses[i].getTitle());
//         }
//     }
// }

// // Course class
// class Course {
//     private String courseCode;
//     private String title;
//     private String instructorName;

//     // Constructor
//     public Course(String courseCode, String title, String instructorName) {
//         this.courseCode = courseCode;
//         this.title = title;
//         this.instructorName = instructorName;
//     }

//     // Method to display course information
//     public void displayCourseInfo() {
//         System.out.println("Course Code: " + courseCode);
//         System.out.println("Title: " + title);
//         System.out.println("Instructor: " + instructorName);
//         System.out.println("----------------------");
//     }

//     // Getter for course title
//     public String getTitle() {
//         return title;
//     }
// }

// // Main class
// public class lab{
//     public static void main(String[] args) {
//         // Creating Course objects
//         Course course1 = new Course("CS101", "OOP", "Garcia");
//         Course course2 = new Course("CS102", "C++", "Antony");

//         // Creating Student objects
//         Student student1 = new Student(1, 22, "John",3);
//         Student student2 = new Student(2, 23, "Alice",3);

//         // Enrolling students in courses
//         student1.enrollCourse(course1);
//         student1.enrollCourse(course2);

//         // Displaying student information
//         System.out.println("\nStudent Details:");
//         student1.displayStudentInfo();
//         student2.displayStudentInfo();
//     }
// }


// class Employee {
//     String name;
//     double salary;

//     public Employee(String name, double salary) {
//         this.name = name;
//         this.salary = salary;
//     }

//     public void work() {
//         System.out.println(name + " is working.");
//     }

//     public void showInfo() {
//         System.out.println("Name: " + name + ", Salary: $" + salary);
//     }
// }

// class Manager extends Employee {
//     public Manager(String name, double salary) {
//         super(name, salary);
//     }

//     @Override
//     public void work() {
//         System.out.println(name + " is managing the team.");
//     }
// }

// class Developer extends Employee {
//     public Developer(String name, double salary) {
//         super(name, salary);
//     }

//     @Override
//     public void work() {
//         System.out.println(name + " is writing code.");
//     }
// }

// class Designer extends Employee {
//     public Designer(String name, double salary) {
//         super(name, salary);
//     }

//     @Override
//     public void work() {
//         System.out.println(name + " is creating UI designs.");
//     }
// }

// class Intern extends Employee {
//     public Intern(String name, double salary) {
//         super(name, salary);
//     }

//     @Override
//     public void work() {
//         System.out.println(name + " is learning new skills.");
//     }
// }

// public class  {
//     public static void main(String[] args) {
//         Manager manager = new Manager("Alice", 80000);
//         Developer developer = new Developer("Bob", 60000);
//         Designer designer = new Designer("Charlie", 55000);
//         Intern intern = new Intern("David", 20000);

//         manager.showInfo();
//         manager.work();

//         developer.showInfo();
//         developer.work();

//         designer.showInfo();
//         designer.work();

//         intern.showInfo();
//         intern.work();
//     }
// }
