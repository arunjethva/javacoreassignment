package corejava_assignments;

import java.util.HashMap;

public class O76_corejava_MapValues {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "Arun");
		map.put(2, "Janak");
		map.put(3, "Dixit");
		map.put(4, "Mayank");
		map.put(5, "Sahil");

		System.out.println(map.values());
	}

}
