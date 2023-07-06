package OOPS.Basics;

public class Student {
    int rollNo;
    String name;
    float marks;

    void studentBio() {
        System.out.println("Hello My name is "+this.name+" and i have got "+this.marks+" percent in my semester exams");
    }


    // Parametrized Constructor:
    Student(int r, String n, float m) {
        this.rollNo = r;
        this.name = n;
        this.marks = m;
    }


    // Constructor that takes values from another object:
    Student(Student other) {
        this.name = other.name;
        this.rollNo = other.rollNo;
        this.marks = other.marks;
    }


    /**
     * Calling a constructor from another constructor:
     * this constructor internally calls the first constructor and passes the values;
     */
    Student() {
        this(12, "Faisal", 99.0f);
    }


    public static void main(String[] args) {

        // creating one object and pass the values for the parameterized constructor:
        Student student1 = new Student(50, "Tahir Khan", 44.2f);

        // Creating another object and pass an object as the argument:
        Student student2 = new Student(student1);

        System.out.println(student1.name);
        student1.studentBio();

        student2.studentBio();
    }
}
