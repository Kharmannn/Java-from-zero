package org.mortgage;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int principal;
        while (true) {

            System.out.print("Principal ($1K - $1M) : ");
            int min = 1000;
            int max = 1000000;
            principal = scanner.nextInt();

            if (principal >= min && principal <= max) {
                break;
            }
            System.out.println("Enter a value between 1,000 and 1,000,000");
        }

        float interest;
        while (true) {

            System.out.println("Annual Interest Rate (0 - 10)");

            int minInterest = 0;
            int maxInterest = 10;
            interest = scanner.nextFloat();

            if (interest > minInterest && interest <= maxInterest) {
                break;
            }

            System.out.print("Enter a value between 0 and 10");
        }

        int year;
        while (true) {

            System.out.print("Period (Years)");

            int minYear = 1;
            int maxYear = 10;
            year = scanner.nextInt();

            if (year >= minYear && year <= maxYear) {
                break;
            }

            System.out.println("Enter a value between 1 and 30");
        }

        float result = principal * (interest/12) * year;
        System.out.println("Mortgage : " + result);
    }
}
