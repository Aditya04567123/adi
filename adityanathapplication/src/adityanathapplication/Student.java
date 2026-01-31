package adityanathapplication;

public class Student {
    int id;
    String name;
    int marks;

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
        System.out.println();
    }

    public static void main(String[] args) {

        Student s1 = new Student();
        s1.id = 1;
        s1.name = "Aditya";
        s1.marks = 100;

        Student s2 = new Student();
        s2.id = 3;
        s2.name = "Aditya";
        s2.marks = 200;

        // Displaying student details
        s1.display();
        s2.display();
    }
}
