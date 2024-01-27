package corejava_assignments;

import java.util.HashMap;

public class O63_coreJava_keyValue {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "arun");
		map.put(2, "Janak");
		map.put(3, "mayank");
		map.put(4, "dixit");
		map.put(5, "sahil");
		
		
		System.out.println("Count the number of keyValue is : " +map.size());

	}
}
