package com.trimble.test;

public class Threads {
	public static class CustomThread1 extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				try {
					Thread.sleep(500);
					System.out.println(i);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
	}
	
	public static class CustomThread2 extends Thread {
		@Override
		public void run() {
			for (int i = 1; i <= 5; i++) {
				throw new Exception();
				System.out.println(i);
			}
		}
	}
	
	public static void main(String[] args) throws Exception {
		CustomThread1 thread1 = new CustomThread1();
		CustomThread1 thread2 = new CustomThread1();
		CustomThread1 thread3 = new CustomThread1();
		CustomThread1 thread4 = new CustomThread1();
		CustomThread1 thread5 = new CustomThread1();
		CustomThread1 thread6 = new CustomThread1();
		CustomThread1 thread7 = new CustomThread1();
		CustomThread1 thread8 = new CustomThread1();
		
		thread1.start();
		thread1.join();
		thread2.start();
		thread3.start();
		
		thread4.start();
		thread4.join(1500);
		thread5.start();
		thread6.start();
		
		thread7.run();
		thread8.run();

		thread1.start();
		
		CustomThread2 thread9 = new CustomThread2();
		thread9.start();
	}
}