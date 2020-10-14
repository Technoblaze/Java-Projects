package com.Notepad;

import java.util.Scanner;


public class CalculatorProject {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dream Corps Calculator!");
        System.out.println("Put in the first number");
        Scanner dreamCorpsCalc = new Scanner(System.in);
        int num1 = dreamCorpsCalc.nextInt();
        System.out.println("Put the second number");
        int num2 = dreamCorpsCalc.nextInt();
        System.out.println("Choose an operator: +, -, *, /");
        char operator = dreamCorpsCalc.next().charAt(0);
        int result = 0;
        switch (operator) {
            case '+' -> {
                result = num1 + num2;
                System.out.println(result);
            }
            case '-' -> {
                result = num1 - num2;
                System.out.println(result);
            }
            case '*' -> {
                result = num1 * num2;
                System.out.println(result);
            }
            case '/' -> {
                result = num1 / num2;
                System.out.println(result);
            }
            default -> {
                System.out.println("Invalid operator");
                System.out.println("This is your answer" + result + "!");
            }
        }

    }

}









