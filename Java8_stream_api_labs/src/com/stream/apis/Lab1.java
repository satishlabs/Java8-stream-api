package com.stream.apis;

//1. Simple Runnable Exmaple
public class Lab1 {
	public static void main(String[] args) {
		System.out.println("Running Lab1: ");
		runnable1();

		System.out.println("\nRunning Lab2: ");
		runnable2();

		System.out.println("\nRunning Lab3: ");
		runnable3();

		System.out.println("\nRunning Lab4: ");
		runnable4();

		System.out.println("\nRunning Lab5: ");
		runnable5();
		
		System.out.println("\nRunning Lab6: ");
		runnable6();
	}


	// 1. Basic Runnable using Lambda
	public static void runnable1() {
		Runnable r = () -> System.out.println("Hello, Lambda!");
		new Thread(r).start();

	}

	// 2. Runnable with multiple statements
	private static void runnable2() {
		Runnable r = () -> {
			System.out.println("Thread started");
			System.out.println("Running multiple lines in Lambda");
		};
		new Thread(r).start();

	}

	// 3. Runnable as inline Lambda
	private static void runnable3() {
		new Thread(() -> System.out.println("Inline Lambda Runnable")).start();

	}

	// 4. Multiple Threads using Lambda inside loop
	private static void runnable4() {
		for (int i = 1; i <= 3; i++) {
			int threadNumber = i;
			new Thread(() -> System.out.println("Thread " + threadNumber + " running")).start();
		}

	}

	// 5. Runnable with sleep and exception handling
	private static void runnable5() {
		Runnable taks = () -> {
			try {
				System.out.println("Thread sleeping...");
				Thread.sleep(1000);
				System.out.println("Thread woke up!");
			} catch (InterruptedException e) {
				System.out.println("Thread interrupted!");
			}
		};
		new Thread(taks).start();

	}
	
	//6. Runnable with named class and lambda
	private static void runnable6() {
		Runnable namedRunnable = new MyRunnable();
		new Thread(namedRunnable).start();
		
		Runnable lambdaRunnable = () -> System.out.println("Lambda Runnable Running");
		new Thread(lambdaRunnable).start();
		
	}
	
	// Supporting class for Lab6
	static class MyRunnable implements Runnable{

		@Override
		public void run() {
			System.out.println("Named Runnable Running");
			
		}
		
	}

}
