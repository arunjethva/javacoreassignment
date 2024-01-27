package corejava_assignments;

class Thr implements Runnable {
	public void run() {
		System.out.println("Threas is running ....");
	}
}

public class O44_coreJava_implements {
	public static void main(String[] args) {

		Thr th = new Thr();
		Thread t1 = new Thread(th);
		t1.run();

	}

}
