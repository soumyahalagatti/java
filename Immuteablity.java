package Homework;

public class Immuteablity {
	

		public static void  main (String[]args) {
			String s1 = new String("hello ");
			String s2 = s1.concat("siri ");
			System.out.println(s1);
			System.out.println(s2);
			int a = 3;
			String s3 = "hello world";
			System.out.println(s3);
			System.out.println(s3.length());
			System.out.println(s1.length());
			System.out.println(s2.length());
			}

	}

