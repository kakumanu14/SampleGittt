package org.abc;

public class MethodOverload {
public void amazon() {
	System.out.println("Method");
}

public void amazon(int a) {
	System.out.println(a);
	System.out.println("Method with single parameter");
}

public void amazon(int a, String s) {
	System.out.println("Method with more than one parameter");
}

public static void main(String[] args) {
	MethodOverload m = new MethodOverload();
	m.amazon();
	m.amazon(10);
	m.amazon(10, "test");
	
}

}
