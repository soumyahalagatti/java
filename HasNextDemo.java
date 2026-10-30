package Homework;
import java.util.ArrayList;
import java.util.Iterator;

public class HasNextDemo {
	public static void main(String[] args) {
		ArrayList<String> names= new ArrayList<>();
		names.add("asha");
		names.add("rahul");
		Iterator<String> it = names.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
