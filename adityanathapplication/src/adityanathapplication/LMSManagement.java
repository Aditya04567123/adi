package adityanath;
import java.util.*;
public class LMSManagement {
	public static void main(String[] args) {
		  List<String>courses=new ArrayList<>();
		  courses.add("Java");
		  courses.add("Python");
		  courses.add("Spring");
		  
		  Set<String>students=new HashSet<>();
		  students.add("a@gmail.com");
		  students.add("b@gmail.com");
		  
		  Set<String>recentCourses=new LinkedHashSet<>();
		  recentCourses.add("Java");
		  recentCourses.add("Python");
		  
		  Queue<String>doubts=new PriorityQueue<>();
		  doubts.add("Premium Student doubt");
		  doubts.add("Normal Student doubt");
		  
		  Deque<String>history=new ArrayDeque<>();
		  history.push("enrolled Java");
		  history.push("enrolled Python");
		  history.pop();
		  Map<String,String>enrollment=new HashMap<>();
		  enrollment.put("a@gmail.com","Java");
		  enrollment.put("b@gmail.com","Python");
		  

	}

}
