package com.skilldistillery.foodtruck;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		FoodTruckApp foodTruckApp = new FoodTruckApp();

		FoodTruck[] foodTruck = new FoodTruck[5];

		foodTruckApp.foodTruckInput(scanner, foodTruck, foodTruckApp);
	}

	public void foodTruckInput(Scanner scanner, FoodTruck[] foodTruckArray, FoodTruckApp foodTruckApp) {
		boolean keepGoing = true;
		int rating = 0;
		double sum = 0;
		double average;
		double numRatings = 0;
		String name = "";
		String type = "";

		for (int i = 0; i < foodTruckArray.length; i++) {

			System.out.println("Input your food truck name: ");
			name = scanner.nextLine();
			if (name.equals("quit")) {
				break;
			}
			System.out.println("Input your selected food type: ");
			type = scanner.nextLine();
			System.out.println("Input your rating: ");
			rating = scanner.nextInt();
			scanner.nextLine();

			FoodTruck truckConstructor = new FoodTruck(name, type, rating);
			foodTruckArray[i] = truckConstructor;
		}
		while (keepGoing) {

			System.out.println("Select an integer for whether you would like to: ");
			System.out.println("1: Print all existing food truck data.");
			System.out.println("2: See the average rating of all truck data.");
			System.out.println("3: Display the highest-rated food truck.");
			System.out.println("4: Quit the program.");

			String input = scanner.nextLine();
			
			switch (input) {

			case "1":
				for (FoodTruck foodTruck2 : foodTruckArray) {

					if (foodTruck2 != null) {
						System.out.println(foodTruck2);
					}
				}
				break;
			case "2":
				for (int i = 0; i < foodTruckArray.length; i++) {
					if (foodTruckArray[i] != null) {

						sum += foodTruckArray[i].getNumericRating();
						numRatings = i + 1;
					}
				}
				average = sum / numRatings;
				System.out.println(average);
				break;

			case "3":
				double highestRating = 0;
				int index = 0;

				for (int i = 0; i < foodTruckArray.length; i++) {
					if (foodTruckArray[i] != null) {
						if (foodTruckArray[i].getNumericRating() > highestRating) {
							highestRating = foodTruckArray[i].getNumericRating();
							index = i;
						}
					}
				}
				System.out.println("The highest flavour count is at: " + foodTruckArray[index]);
				break;
			case "4":
				keepGoing = false;
				break;
			default:
				System.out.println("Follow the rules bro.");
				break;
			}
		}
	}
}