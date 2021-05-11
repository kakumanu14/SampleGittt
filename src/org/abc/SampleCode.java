package org.abc;
import org.xyz.*;

public class SampleCode {
	
	//method defining
	public void demo() {
		System.out.println("method");
	}
	
	public void sample() {
		System.out.println("method2");
	}
	
	
	public static void main(String[] args) {
		System.out.println("hello");
		
		//Classname refname = new Classname(); -> object creation
		SampleCode s = new SampleCode();
		s.demo();
		s.sample();
		
		SampleCode2 s2 = new SampleCode2();
		s2.axis();
		s2.hdfc();
	
		
		
	}

}
