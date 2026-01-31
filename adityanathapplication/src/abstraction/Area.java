package abstraction;

public class Area {
    public static void main(String[] args) {
        disp(new Cylinder(4,4));
        disp(new Rectangle(3,5));
        disp(new Circle(3));
        disp(new Triangle(3,5));
        disp(new Square(5));
    }
    static void disp(Shape s) {
    	s.findArea();
    	s.dispArea();
    }
}
abstract class Shape{
	double area;
	abstract void findArea();
	abstract void dispArea();
}
class Cylinder extends Shape{
	int r;
	int h;
	public Cylinder(int r,int h) {
		
		this.r=r;
		this.h=h;
	}
	public int getR() {
		return r;
	}
	public int getH() {
		return h;
	}
	void findArea() {
		area=2*3.14*r*h;
	}
	void dispArea() {
		System.out.println("area of cylinder:"+area);
	}
}
class Circle extends Shape{
	int r;
	
	public Circle(int r) {
		this.r=r;
	}
	public int getR() {
		return r;
	}
	void findArea() {
		area=3.14*r*r;
	}
	void dispArea() {
		findArea();
	}
}
class Rectangle extends Shape{
	int l;
	int b;
	
	public Rectangle(int l,int b) {
		this.l=l;
		this.b=b;
	}
	public int getL() {
		return l;
	}
	public int getB() {
		return b;
	}
	void findArea() {
		area=l*b;
	}
	void dispArea() {
		findArea();
	}
}
class Triangle extends Shape{
	int b;
	int h;
	
	public Triangle(int b,int h) {
		this.b=b;
		this.h=h;
	}
	public int getB() {
		return b;
	}
	public int getH() {
		return h;
	}
	void findArea() {
		area=b*h;
	}
	void dispArea() {
		findArea();
	}
}
class Square extends Shape{
	int s;
	
	public Square(int s) {
		this.s=s;
	}
	public int getS() {
		return s;
	}
	void findArea() {
		area=s*s;
	}
	void dispArea() {
		findArea();
	}
}