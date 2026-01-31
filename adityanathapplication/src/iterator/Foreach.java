package iterator;

public class Foreach {
	
	public static void main(String[] args) {
		
		Student s1= new Student ("Harsh",20,"male");
		Student s2= new Student ("Harshad",20,"male");
		Student s3= new Student ("Har",20,"male");
		
		Student[] arr = {s1,s2,s3};
		
		for (Student s : arr) { 
			System.out.print(s.getName() + " ");
			System.out.print(s.getAge()+ " ");
			System.out.println(s.getGender() );
			System.out.println("-----------");
		}
		
	}

}


class Student {
	
	String name ;
	int age;
	String gender;

	Student (String name,int age, String gender) {
		this.name = name ;
		this.age = age ;
		this.gender= gender ;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
	
}