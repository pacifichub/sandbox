package com.sandbox.java.compartor;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class FirstNameComparator implements Comparator<Object> {

	@Override
	public int compare(Object o1, Object o2) {
		
		if(!(o1 instanceof Employee) || !(o2 instanceof Employee))
            throw new ClassCastException("Comparing objects not of type Employee");

		Employee e1 = (Employee) o1;
		Employee e2 = (Employee) o2;
		return e1.getFirstName().compareTo(e2.getFirstName());
	}
	
	public static void main(String[] args) {
	
		Employee[] empArray = new Employee[3];
		empArray[0] = new Employee("Bob");
		empArray[1] = new Employee("Stevens");
		empArray[2] = new Employee("Doe");
	
		Arrays.sort(empArray, new FirstNameComparator());
		
		for(Employee e: empArray){
			System.out.println(e.getFirstName());
		}
 	}

}
