package org.abc;

public class EmployeeNotFoundException extends Exception{
@Override
public String getMessage() {
	String s = "EmployeeNotFoundException";
	return s;
	
}
}
