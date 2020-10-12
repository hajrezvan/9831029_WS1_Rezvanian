package com.university;

import java.util.Scanner;

public class ProblemOne {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	int number1 = scanner.nextInt();
	int number2 = scanner.nextInt();
        if (number1 > number2) {
            if (number1 / number2 != 1) {
                System.out.println("Avval nistand!! :(");
            } else {
                System.out.println("Avval hastand :)");
            }
        } else {
            if (number2 / number1 != 1) {
                System.out.println("Avval nistand!! :(");
            } else {
                System.out.println("Avval hastand :)");
            }
        }
    }
}
