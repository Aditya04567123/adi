package com.company.Employees;

import java.util.Arrays;
import java.util.List;

public class ass2 {

	public static void main(String []args) {
		List<Integer> marks = Arrays.asList(30, 45, 60, 35, 80);
		
		int total = marks.stream()
				.filter(m -> m >= 40)
				.map(m -> m + 5)
				.reduce(0, Integer::sum);
		
		System.out.println("total salary is equal to :"+total);
		
	}
}

