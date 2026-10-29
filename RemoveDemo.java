package Homework;
import java.util.ArrayList;

public class RemoveDemo {
	public static void main(String [] args) {
		ArrayList<String> names=new ArrayList<>();
		names.add("soumya");
		names.add("madhu");
		names.add("ashwini");
		names.remove(0);
		names.remove("madhu");
		System.out.println(names);
	}

}
