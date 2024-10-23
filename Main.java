package com.keyin.domain;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to the Airport Database!");
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1. List all the aircraft in each fleet");
            System.out.println("2. How many passengers can each aircraft hold");
            System.out.println("3. List airports in a province by IATA code");
            System.out.println("4. List all provinces that have more than 1 airport");
            System.out.println("5. List all provinces that have over 1 million people that require additional airports");
            System.out.println("6. Exit\n");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    Aircraft.airline();
                    break;
                case 2:
                    Aircraft.capacity();
                    break;
                case 3:
                    City.province();
                    break;
                case 4:
                    Airport.IATA_code();
                    break;
                case 5:
                    City.province_pop();
                    break;
                case 6:
                    System.exit(0);
                default:
                    System.out.println("Invalid option. Please try again.");
            }
        }
    }
}








