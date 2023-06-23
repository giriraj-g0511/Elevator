package com.elevator_project;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Lift Testing STARTS");

//		--------- Manual Call ------------
		manualElevator();
//		--------- Lunch Time Random Call ------------
		automaticElevator();
		System.out.println("Lift Testing ENDS");

	}

	static void automaticElevator() throws InterruptedException {
		com.elevator_project.Elevator elevator = new com.elevator_project.Elevator();
		elevator.lunchtimeElevatorRush();
		elevator.start();
	}

	static void manualElevator() throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		com.elevator_project.Elevator elevator = new com.elevator_project.Elevator();

		System.out.println("Enter a starting floor 0 - 10");
		int start = sc.nextInt();
		System.out.println("Enter a destination floor 0 - 10");
		int end = sc.nextInt();
		elevator.callElevator(start, end);
		elevator.start();
	}

}
