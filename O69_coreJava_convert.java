package corejava_assignments;

import java.util.HashSet;

public class O69_coreJava_convert {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Arun");
		set.add("Janak");
		set.add("mayank");
		set.add("Sahil");
		set.add("Dixit");

		System.out.println("The Set is :" + set);
		String array[] = new String[set.size()];

		System.out.println("After convert hasthset into array :" + "\n");

		set.toArray(array);

		for (String s : array) {
			System.out.println(s);
		}

	}
}
