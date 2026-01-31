package inheritance;
public class HAS_A2 {
	public static void main(String[] args) {
		Student s=new Student();
		Bike b=new Bike("Pulsar",145000,"BlackRed");
		System.out.println(b.getBrand());
		s=null;
		s.hasA(b);
		
		System.out.println("-------------------");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
	}
}
class Student{
	Heart h=new Heart("Tester",45);
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());	
	}
}
class Bike{
	String brand;
	double price;
	String color;
	public Bike(String brand,double price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
		
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand=brand;
	}
	public double getPrice() {
	    return price;
	}

	public String getColor() {
	    return color;
	}

}
class Heart{
	String job;
	double weight;
	public Heart(String job,double Weight) {
		this.job=job;
		this.weight=Weight;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job=job;
	}
	public double getWeight() {
		return weight;
	}
	public void SetWeight(double Weight) {
		this.weight=Weight;
	}
}