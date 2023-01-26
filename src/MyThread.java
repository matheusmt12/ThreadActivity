import java.lang.Thread;
import java.util.Iterator;
import java.util.Random;

public class MyThread extends Thread {

	private int jump;
	private int and = 0;
	private int position = 0;

	public void run() {
		Random r = new Random();
		while (and == 0) {
			if (jump >= 10) {
				try {
					resume();
				} catch (Exception e) {
					// TODO: handle exception
				}
			} else {
				position = r.nextInt(2);
				jump += position;

				System.out.println(getName() +" "+ position + " pulos" );
				
				try {
					sleep(1000);
				} catch (Exception e) {
					// TODO: handle exception
				}
				if (jump >= 10) {
					System.out.println(getName() +" Chegou");
					and = 1;

				}
			}
		
		}
		System.out.println(getName() + " quantidade de pulos : " + jump);

	}

	public int getJump() {
		return jump;
	}

	public void setJump(int jump) {
		this.jump = jump;
	}

	public int getAnd() {
		return and;
	}

	public void setAnd(int and) {
		this.and = and;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int posicion) {
		this.position = posicion;
	}

}
