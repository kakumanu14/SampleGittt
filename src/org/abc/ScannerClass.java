package org.abc;

import java.util.Scanner;

public class ScannerClass {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value");
	char c = sc.next().charAt(0);
	System.out.println(c);
}
}
