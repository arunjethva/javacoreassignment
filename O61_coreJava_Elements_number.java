package corejava_assignments;

import java.util.HashSet;

public class O61_coreJava_Elements_number {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();
		
		set.add("JAVA");
		set.add("PHP");
		set.add("PYTHON");
		set.add("C");
		set.add("C++");
		set.add("INDROID");
		set.add("IOS");

		System.out.println("The HaseSet is : " + set);
		
		System.out.println("In HashSet Number of Elements is " + set.size());
		
	}

}
