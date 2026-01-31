package inheritance;

class student {
    String name;
    int age;

    heart heart;
    brain brain;
    Book book;
    bike bike;

    public student(String name, int age, heart heart, brain brain, Book book, bike bike) {
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

    @Override
    public String toString() {
        return "Book{name='" + name + "', price=" + price + "}";
    }
}
class heart {
    String function;
    float weight;

    public heart(String function, float weight) {
        this.function = function;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "heart{function='" + function + "', weight=" + weight + "}";
    }
}

class brain {
    String job;
    float weight;

    public brain(String job, float weight) {
        this.job = job;
        this.weight = weight;
    }

    public String toString() {
        return "brain{job='" + job + "', weight=" + weight + "}";
    }
}
class bike {
    String name;
    double price;
    String model;

    public bike(String name, double price, String model) {
        this.name = name;
        this.price = price;
        this.model = model;
    }
    public String toString() {
        return "bike{name='" + name + "', price=" + price + ", model='" + model + "'}";
    }
}

public class HAS_A3 {
    public static void main(String[] args) {

        heart h = new heart("Pump Blood", 2.5f);
        brain b = new brain("Thinking", 1.4f);
        Book book = new Book("Java Programming", 450);
        bike bk = new bike("CB Shine", 65000, "Honda");

        student s = new student("Govind", 21, h, b, book, bk);

        s.displayStudent();
    }
}


	