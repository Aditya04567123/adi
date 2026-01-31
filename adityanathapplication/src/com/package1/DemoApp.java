package com.package1;

public class DemoApp{
	public int a;
	protected int b;
	int c;
	private int d;
	public static void main(String[] args) {
		DemoApp d=new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
	}
}
class Demo1{
	void disp() {
		DemoApp d=new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		//System.out.println(d.d);
	}
}
class Demo2{
	void disp() {
		DemoApp d=new DemoApp();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		//System.out.println(d.d);
	}
}