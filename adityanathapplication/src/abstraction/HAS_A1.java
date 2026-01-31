package abstraction;

public class HAS_A1 {

	public static void main(String[] args) {
		Student s=new Student();
		System.out.println("Name from Human:"+s.name);
		System.out.println("*****************");
		bike b4=new bike("Honda",100000);
		s.hasA(b4);
		System.out.println("*****************");
		Book b5=new Book("one piece",1155);
		s.hasA(b5);
		System.out.println("***************");
		System.out.println("---brain---");
		System.out.println(s.b1.getCells());
		System.out.println(s.b1.getWeight());
		System.out.println("***************");
		System.out.println("---heart-----");
		System.out.println(s.h1.getJob());
		System.out.println(s.h1.getWeight());
	}
} 
class Human{
	heart h=new heart("Pump blood:",3);
	Brain b=new Brain(1000,1);
}
class Student extends Human{
	Brain b1=new Brain(10000,500);
	heart h1=new heart("Pumping",50);
	void hasA(bike b2) {
		System.out.println("---bike---");
		System.out.println(b2.getBrand());
		System.out.println(b2.getPrice());
	}
}
class heart{
	String job;
	int weight;
	public heart(String job,int weight) {
		super();
		this.job=job;
		this.weight=weight;
	}
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
}
class Brain{
	int cells;
	int weight;
	public Brain(int cells,int weight) {
		super();
		this.cells=cells;
		this.weight=weight;
	}
	public int getCells() {
		return cells;
	}
	public int getWeight() {
		return weight;
	}
}
class bike{
	String brand;
	int price;
	public bike(String brand,int price) {
		super();
		this.brand=brand;
		this.price=price;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
}
class Book{
	String name;
	int price;
	public Book(String name,int price) {
		super();
		this.name=name;
		this.price=price;
	}
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
}

