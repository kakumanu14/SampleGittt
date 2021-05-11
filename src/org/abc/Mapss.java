package org.abc;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Mapss {
public static void main(String[] args) {
	
	//initiate a map
	Map<Integer, String> m = new LinkedHashMap<>();
	
	//put the elements into list
	m.put(10, "manual");
	m.put(20, "automation");
	m.put(30, "selenium");
	
	System.out.println(m);
	
	System.out.println("****************");
	
	//size of map
	System.out.println("size of map = "+m.size());
	
	//to pick values of corresponding keys
	String s = m.get(20);
	System.out.println("Key = "+s);
	
	//to check whether key is present in map or not
	boolean containsKey = m.containsKey(20);
	System.out.println("contains key ? "+containsKey);
	
	//to check whether value is present in map or not
	boolean containsValue = m.containsValue("selenium");
	System.out.println("contains value ? "+containsValue);
	
	//to print out only keys
	Set<Integer> keySet = m.keySet();
	System.out.println("all keys = "+keySet);
	
	//to print out only values
	Collection<String> values = m.values();
	System.out.println("all values = "+values);
	
	//iterate a map
	Set<Entry<Integer,String>> entrySet = m.entrySet();
	for (Entry<Integer, String> x : entrySet) {
		System.out.println(x);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
