package org.abc;

public class Arrayss {
	
	public static void main(String[] args) {
		//to define an array
		int a[] = new int[5];
		a[0] = 10;
		a[1] = 20;
		
		a[3] = 40;
		a[4] = 50;
		
	//to find the length of an array
		int length = a.length;
		System.out.println("Length of my array = "+length);
		
		//to print particular element in array
		System.out.println("print particular element in array = "+a[2]);
		
		System.out.println("***********************");
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
			
		}
		System.out.println("=====================================");
		for (int x : a) {
			System.out.println(x);
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
