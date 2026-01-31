package adityanathapplication;

import java.util.ArrayList;
import java.util.List;
class Student2Mt {
    int id;
    String name;
    double marks;

    Student2Mt(int id, String name, double marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }
    void display() {
        System.out.println(id + " " + name + " " + marks);
    }
}
public class Student2Management {
    public static void main(String[] args) {
        List<Student2Mt> students = new ArrayList<>();
        students.add(new Student2Mt(101, "Aditya", 87));
        students.add(new Student2Mt(102, "Aditya", 25));
        students.add(new Student2Mt(103, "Aditya", 76));
        for (Student2Mt s : students) {
            s.display();
        }
    }
}

