package model;

public class Carrerita extends Thread {

	public static Thread l1, l2, l3, l4;

	public Carrerita() {
		l1 = new Thread(new Runnable() {

			@Override
			public void run() {
				// System.out.println("Carreritas jijijija");
				for (int i = 1; i <= 10; i++) {
					try {

					} catch (Exception e) {
						e.printStackTrace();
					}
					System.out.println("corri�: " + i + " mts");
				}
				// System.out.println("acab�");
			}

		});

		l2 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10; i++) {
					try {

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println("corri�: " + i + " mts");
				}
			}

		});

		l3 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10; i++) {
					try {

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println("corri�: " + i + " mts");
				}
			}

		});

		l4 = new Thread(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for (int i = 1; i <= 10; i++) {
					try {

					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					System.out.println("corri�: " + i + " mts");
				}
			}

		});
		
	}
	public void run() {
		l1.start();
		l2.start();
		l3.start();
		l4.start();
	}
}
