package com.jsp.oops;
class Employee
{
String name;
int age;
int id;
public Employee(String name, int age, int id) {
	this.name = name;
	this.age = age;
	this.id = id;
}


@Override
public String toString() {
	return "Employee [name=" + name + ", age=" + age + ", id=" + id + "]";
}


public class EmployeeDetailes {

public static void main(String[] args) {
 Employee e1=new Employee("Suresh",23,101);
 System.out.println(e1.toString());
 System.out.println(e1);
 Employee e2=new Employee("Giri",24,102);
 System.out.println(e2.toString());
 System.out.println(e1.getClass().getSimpleName());
 System.out.println(e2);


	}
}
}


