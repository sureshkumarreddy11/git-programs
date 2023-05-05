package com.jsp.oops;
class Enginee{
	String name;
	int no;
	String brand;
	public Enginee(String name, int no, String brand) {
		
		this.name = name;
		this.no = no;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Enginee [name=" + name + ", no=" + no + ", brand=" + brand + "]";
	}
	
	
}
class Car
{
	Enginee e1;
	String name;
	int no;
	String brand;
	public Car(Enginee e1, String name, int no, String brand) {
		this.e1 = e1;
		this.name = name;
		this.no = no;
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Car [e1=" + e1 + ", name=" + name + ", no=" + no + ", brand=" + brand + "]";
	}
	
	
	
	}

public class Compositon {

	public static void main(String[] args) {
		
		Car c1=new Car(new Enginee("suresh",101,"audi"), "Swift", 101, "audi");
		System.out.println(c1.e1);
		
	}

}
