package inheritance;

import java.util.Scanner;

public class Player {
	String name;
	int age;
	int BestScore;
	String country;
	String Team;
	
	public Player(String name,int age,int BestScore,String Country,String Team) {
		this.name=name;
		this.age=age;
		this.BestScore=BestScore;
		this.country=Country;
		this.Team=Team;
	}
	public String name() {
		return name;
	}
	public String country() {
		return country;
	}
	public int age() {
		return age;
	}
	public int BestScore() {
		return BestScore;
	}
	public String Team() {
		return Team;
	}
	class Cricket extends Player{
		
	}
	public class Inheritance{
		public static void main(String[] args) {
		     Scanner sc=new Scanner(System.in);
		     System.out.println()
		     
		     

		}

	}

	

	