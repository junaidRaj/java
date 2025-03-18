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


import java.time.LocalDate;

class Students {
   
    private String name;
    private int age;
    private String grade;
    private String studentID;
    private LocalDate joiningDate; 

    public Students(String name, int age, String grade, String studentID, LocalDate joiningDate) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.studentID = studentID;
        this.joiningDate = joiningDate;
    }

    public void displayDetails() {
        System.out.println("Student Details:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + studentID);
        System.out.println("Joining Date: " + joiningDate);
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Students student1 = new Students("Rock", 18, "12th Grade", "S1001", LocalDate.of(2023, 9, 1));
        Students student2 = new Students("Dom", 19, "College Freshman", "S1002", LocalDate.of(2022, 8, 15));

        student1.displayDetails();
        student2.displayDetails();
    }
}
