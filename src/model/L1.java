package model;

public class L1 extends Thread {
	public L1(String nombre) {
		super(nombre);
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i = 1; i <= 20; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			System.out.println(Thread.currentThread().getName() + " - corri�: " + i + " mts.");
			if (i % 10 == 0) {
				try {
					Thread.sleep(2000);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - acab� ");
	}

}
