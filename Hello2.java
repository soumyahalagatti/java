package Homework;

public class Hello2 {
			public static void main(String... args) {
			System.out.println("start");
			try {
				int[]ab={10,20,30};
				System.out.println(ab[0]);
				System.out.println(ab[1]);
				System.out.println(ab[2]);
				System.out.println(ab[3]);
			}
			catch(Exception e) {
				System.out.println("exception handeling" +e);
			}
			System.out.println("end");
		}

	}

