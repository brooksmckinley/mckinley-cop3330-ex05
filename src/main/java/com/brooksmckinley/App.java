/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Brooks McKinley
 */

package com.brooksmckinley;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("What is the first number? ");
        int firstNumber = scan.nextInt();
        System.out.print("What is the second number? ");
        int secondNumber = scan.nextInt();

        System.out.println(generateReport(firstNumber, secondNumber));
    }

    public static String generateReport(int firstNumber, int secondNumber) {
        String addReport = firstNumber + " + " + secondNumber + " = " + add(firstNumber, secondNumber) + "\n";
        String subReport = firstNumber + " - " + secondNumber + " = " + subtract(firstNumber, secondNumber) + "\n";
        String mulReport = firstNumber + " * " + secondNumber + " = " + multiply(firstNumber, secondNumber) + "\n";
        String divReport = firstNumber + " / " + secondNumber + " = " + divide(firstNumber, secondNumber);
        return addReport + subReport + mulReport + divReport;
    }

    public static int add(int a, int b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int divide(int a, int b) {
        return a / b;
    }
}