package org.abc;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserSet {
	public static void main(String[] args) {
		
		Set<Employee> s = new LinkedHashSet<>();
		Employee e1 = new Employee();
		e1.setId(10);
		e1.setName("manual");
		e1.setPhno(111111111l);
		
		Employee e2 = new Employee();
		e2.setId(20);
		e2.setName("Automation");
		e2.setPhno(222222222l);
		
		Employee e3 = new Employee();
		e3.setId(30);
		e3.setName("selenium");
		e3.setPhno(333333333l);
		
		s.add(e1);
		s.add(e2);
		s.add(e3);
		
		
		//iterate a set
		for (Employee x : s) {
			System.out.println(x.getId());
			System.out.println(x.getName());
			System.out.println(x.getPhno());
			
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
