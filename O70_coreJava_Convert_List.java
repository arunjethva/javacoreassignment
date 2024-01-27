package corejava_assignments;

import java.util.ArrayList;
import java.util.HashSet;

public class O70_coreJava_Convert_List {
	public static void main(String[] args) {

		HashSet<String> set = new HashSet<String>();

		set.add("Lion");
		set.add("Tiger");
		set.add("Dear");
		set.add("bear");
		set.add("cheetah");

		System.out.println("The set is : ");
		System.out.println(set);

		ArrayList<String> list = new ArrayList<String>(set);

		System.out.println("After convert HashSet into ArrayList ");
		System.out.println(list);

	}

}
