package corejava_assignments;

import java.util.ArrayList;

public class O51_coreJava_Insert_First {

	public static void main(String[] args) {

		
		ArrayList<Integer>list= new ArrayList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);

		System.out.println(list);
		
		list.add(1,100);
		System.out.println(list);
		
	}
}
