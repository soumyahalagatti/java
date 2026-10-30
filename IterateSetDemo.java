package Homework;
import java.util.HashSet;
public class IterateSetDemo {
	public static void main(String[] args) {
		HashSet<String> tags = new HashSet<>();
		tags.add("java");
		tags.add("collections");
		tags.add("exceptions");
		for(String tag: tags) {
			System.out.println(tag);
		}
	}

}
