package corejava_assignments;

class Sle1 extends Thread {

	public void run() {
		System.out.println("Thread1 is running....");
	}

}

class Sle2 extends Thread {
	public void run() {
		System.out.println("Thread2 is running.....");
	}
}

public class O46_coreJava_sleep {
	public static void main(String[] args) throws InterruptedException {

		Sle1 s1 = new Sle1();
		Sle2 s2 = new Sle2();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {

		}

		s1.start();
		s2.start();
		

	}
}
