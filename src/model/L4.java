package model;

public class L4 extends Thread {
	public L4(String nombre) {
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
			System.out.println(Thread.currentThread().getName() + " - corrió: " + i + " mts.");
			if (i % 10 == 0) {
				try {
					Thread.sleep(2100);
				} catch (Exception e) {
					// TODO: handle exception
					e.printStackTrace();
				}
			}
		}
		System.out.println(Thread.currentThread().getName() + " - acabó ");
	}

}
