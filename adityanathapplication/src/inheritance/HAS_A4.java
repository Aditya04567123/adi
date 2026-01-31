package inheritance;

class Student {
    String name;
    int age;

    Heart heart;
    Brain brain;
    Book book;
    Bike bike;

    public Student(String name, int age, Heart heart, Brain brain, Book book, Bike bike) {
        this.name = name;
        this.age = age;
        this.heart = heart;
        this.brain = brain;
        this.book = book;
        this.bike = bike;
    }

    void displayStudent() {
        System.out.println("Student Name : " + name);
        System.out.println("Age : " + age);
        System.out.println("Heart : " + heart);
        System.out.println("Brain : " + brain);
        System.out.println("Book : " + book);
        System.out.println("Bike : " + bike);
    }
}

class Book {
    String name;
    double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String toString() {
        return "Book{name='" + name + "', price=" + price + "}";
    }
}

class Heart {
    String function;
    float weight;

    public Heart(String function, float weight) {
        this.function = function;
        this.weight = weight;
    }

    public String toString() {
        return "Heart{function='" + function + "', weight=" + weight + "}";
    }
}

class Brain {
    String job;
    float weight;

    public Brain(String job, float weight) {
        this.job = job;
        this.weight = weight;
    }

    public String toString() {
        return "Brain{job='" + job + "', weight=" + weight + "}";
    }
}

class Bike {
    String name;
    double price;
    String model;

    public Bike(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }

    public String toString() {
        return "Bike{name='" + name + "', price=" + price + ", model='" + model + "'}";
    }
}

public class HAS_A4 {
    public static void main(String[] args) {

        Heart h = new Heart("Pump Blood", 2.5f);
        Brain b = new Brain("Thinking", 1.4f);
        Book book = new Book("Java Programming", 450);
        Bike bk = new Bike("CB Shine", 65000, "Honda");

        Student s = new Student("Govind", 21, h, b, book, bk);
        s.displayStudent();
    }
}
