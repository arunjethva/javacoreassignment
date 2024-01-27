package corejava_assignments;

import java.util.HashMap;
import java.util.Map;

public class O62_coreJava_HashMap {
	public static void main(String[] args) {

		HashMap<Integer, String> map = new HashMap<Integer, String>();

		map.put(1, "arun");
		map.put(2, "janak");
		map.put(3, "mayank");
		map.put(4, "sahil");
		map.put(5, "dixit");

		for (Map.Entry kv : map.entrySet()) {
			System.out.println(kv.getKey() + " " + kv.getValue());

		}

	}

}
