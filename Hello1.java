package Homework;

public class Hello1 {
	public static void main(String... args) {
		System.out.println("start");
		try {
			int a=10/0;
		     }
		catch(Exception e) {
			System.out.println("exception handeling");
		}
		System.out.println("end");
	}

}
