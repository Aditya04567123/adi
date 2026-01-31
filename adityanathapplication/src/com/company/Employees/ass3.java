package com.company.Employees;

import java.util.Arrays;
import java.util.List;

public class ass3 {

	public static void main(String []args) {
		List<Integer> salary = Arrays.asList(30000, 45000, 600000, 35000, 80000);
		
		int total = salary.stream()
				.filter(s -> s > 30000)
				.map(s -> s + (s * 10 / 100))
				.reduce(0, Integer::sum);
		
		System.out.println("total salary is equal to :"+total);
		
	}
}

