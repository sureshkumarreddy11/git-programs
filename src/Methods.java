class Student{
String name="Surseh";
int age=18;
int id=101;
}

public class Methods {

	public static void main(String[] args){
		Methods m1=new Methods();
		Student s1=new Student();
		m1.display(s1);

	}
void display(Student s) {
	System.out.println("Student name is:"+s.name);
	System.out.println("Student age is:"+s.age);
	System.out.println("Student id is:"+s.id);
	
}
}
