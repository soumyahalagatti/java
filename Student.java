package Xyz;

public class Student {
	String name;
	int age;
	void  introduce()
	{
		System.out.println("my name is "+ name +" and my age is"+ age);
	}

public static void main (String args[]) {
Student s = new Student();
s.name="soumya";
s.age=19;
s.introduce();
  }
}