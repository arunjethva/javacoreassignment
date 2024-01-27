package corejava_assignments;

import java.util.HashMap;

public class O71_map_emptORnot {
	public static void main(String[] args) {
		HashMap<String, Integer> map = new HashMap<String, Integer>();

		map.put("java", 1);
		map.put("python", 2);
		map.put("Php", 3);
		map.put("C++", 4);
		map.put("c", 5);
		map.put("javasctript", 1);
		
		
		System.out.println(map.isEmpty());
		
	}

}
