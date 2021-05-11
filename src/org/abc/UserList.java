package org.abc;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class UserList {
	public static void main(String[] args) {
		//initiate a list
		List<Employee> l = new ArrayList();
		
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
		
		//adding elements into list
		l.add(e1);
		l.add(e2);
		l.add(e3);
		
		
		//iterate User defned list
		for (int i = 0; i < l.size(); i++) {
			System.out.println(l.get(i).getId());
			System.out.println(l.get(i).getName());
			System.out.println(l.get(i).getPhno());
		}
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
