package com.elevator_project;

import java.util.Scanner;

public class Trigger {

	static void automaticElevator() throws InterruptedException {
		com.elevator_project.Elevator elevator = new com.elevator_project.Elevator();
		elevator.lunchtimeElevatorRush();
		elevator.start();
	}

	static void manualElevator() throws InterruptedException {
		com.elevator_project.Elevator elevator = new com.elevator_project.Elevator();

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a starting floor 0 - 10");
		int start = sc.nextInt();
		System.out.println("Enter a destination floor 0 - 10");
		int end = sc.nextInt();

		elevator.callElevator(start, end);
		elevator.start();
	}

	public static void main(String[] args) throws InterruptedException {
		manualElevator();
	}
}
