package adityanathapplication;

class Student {
    String name;
    int age;
    String gender;

    public Student(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}
public class Student9 {
    public static void main(String[] args) {
        Student s1 = new Student("Aditya", 20, "Male");
        Student s2 = new Student("Riya", 19, "Female");
        s1.display();
        System.out.println();
        s2.display();
    }
}

