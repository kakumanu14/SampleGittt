package org.abc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserMap {
	public static void main(String[] args) {
		Map<Integer, Employee> m = new LinkedHashMap<>();
		
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
		
		m.put(1, e1);
		m.put(2, e2);
		m.put(3, e3);
		
		//iterate a map
		Set<Entry<Integer,Employee>> entrySet = m.entrySet();
		
		for (Entry<Integer, Employee> x : entrySet) {
			System.out.println(x.getKey());
			System.out.println(x.getValue().getId());
			System.out.println(x.getValue().getName());
			System.out.println(x.getValue().getPhno());
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
