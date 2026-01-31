package adityanathapplication;

class Student3
{
	int rollno;
	String name;
	Student3(int rollno,String name)
	{
		this.rollno=rollno;
		this.name=name;
	}
	void displayinfo()
	{
		System.out.println("rollno"+rollno+"Name:"+name);
	}
}
public class Student3{
	public static void main(String[] args) {
		Student3 s1=new Student(122,"Aditya");
		System.out.println("rollno"+s1.rollno+"Name:"+s1.name);
		s1.displayinfo();
	}

}
package adityanathapplication;

class Student3 {
    int rollno;
    String name;

    Student3(int rollno, String name) {
        this.rollno = rollno;
        this.name = name;
    }

    void displayinfo() {
        System.out.println("Roll No: " + rollno + " Name: " + name);
    }

    public static void main(String[] args) {
        Student3 s1 = new Student3(122, "Aditya");
        s1.displayinfo();
    }
}
