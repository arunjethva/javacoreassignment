package corejava_assignments;

class Th1 extends Thread {
	public void run() {
		System.out.println(" Thraed is running...... ");
	}
}

public class O45_coreJava_Thread {
	public static void main(String[] args) {

		Th1 t1 = new Th1();
		t1.run();
	}
}
