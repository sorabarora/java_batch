package jp;

public class Student {
	
	int rollNo, age;
	
	public void display1()
	{
		System.out.println("Welcome to all of you");
	}
	
	public void display2()
	{
		System.out.println("Automation is very easy");
	}
	
	public static void main(String[] args) {
		
		Student s1=new Student();
		s1.display1();
		s1.display2();
		s1.rollNo=1;
		s1.age=33;
		System.out.println("Roll no is "+s1.rollNo);
		System.out.println("Age is "+s1.age);
		
	}

}
