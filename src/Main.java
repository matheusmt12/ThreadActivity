import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		MyThread t1 = new MyThread();
		
		t1.setName("Sapo 1");
		t1.start();

		MyThread t2 = new MyThread();
		
		t2.setName("Sapo 2");
		t2.start();

		MyThread t3 = new MyThread();
		
		t3.setName("Sapo 3");
		t3.start();
		
		MyThread t4 = new MyThread();
		
		t4.setName("Sapo 4");
		t4.start();
		
		MyThread t5 = new MyThread();
		
		t5.setName("Sapo 5");
		t5.start();
		
	}

}
