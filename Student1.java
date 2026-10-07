package Xyz;

public class Student1 {
	private String name;
	private int age;
	public Student1(String name,int age) {
		this.name="Soumya";
		this.age=19;
	}
	
	public static void main(String[] args)
	{ 
		Student1 ss =new Student1("Soumya",19) ;
		System.out.println(ss.name);
		System.out.println(ss.age);
		
	}

}
