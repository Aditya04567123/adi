package inheritance;

public class Player1 {
	String name;
	int age;
	String gender;

}
class Football extends Player1 {
	int goals;
	int assist;
	public Football(String name,int age,String gender,int goals,int assist) {
		this.name=name;
		this.age=age;
		this.gender=gender;
		this.goals=goals;
		this.assist=assist;
	}
	public int getgoals() {
		return goals;
	}
	public int getAssist() {
		return assist;
	}
	public String getName() {
		return name;
	}
}
