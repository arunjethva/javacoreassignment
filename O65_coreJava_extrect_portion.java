package corejava_assignments;
import java.util.ArrayList;
public class O65_coreJava_extrect_portion {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		list.add(60);
		list.add(70);
		list.add(80);
		
		System.out.println("The ArrayList"+list);
		System.out.println("list of 5 elements"+list.subList(0,5));
		
	}
}
