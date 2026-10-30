package Homework;
import java.util.HashMap;

import java.util.Map;
public class IterateMapDemo {
	public static void main(String[] args) {
		HashMap<String, Integer> scores = new HashMap<>();
		scores.put("asha", 90);
		scores.put("rahul",78);
		for(Map.Entry<String,Integer> entry:scores.entrySet()) {
			System.out.println(entry.getKey() +":"+entry.getValue());
		}
	}

}
