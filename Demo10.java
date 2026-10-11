package Homework;

public class Demo10 {

public static void main(String[] args) {

	String s1 = new String("Hello");
	String s2 = new String("hi");
	if (s1 == s2) {
		System.out.println("s");
	} else {
		System.out.println("n");

	}
	if (s1.equals(s2)) {
		System.out.println("s");
	} else {

		System.out.println("n");
	}
	
	String s3 = "Hello";
	String s4 ="what";
	System.out.println("--------------");
	if (s3 == s4) {
		System.out.println("Yes ");
	} else {
		System.out.println("No");

	}
	if (s3.equals(s4)) {
		System.out.println("Yes");
	} else {

		System.out.println("--------------");
		System.out.println("No");
	}
	System.out.println(s1);
	System.out.println(s2);
	int a = 3;

	/*
	 * String s3 = "Hellow world"; System.out.println(s3.length());
	 * 
	 * StringBuffer sb = new StringBuffer("Anand"); sb.append("Pawar");
	 * System.out.println(sb);
	 */

}
}


