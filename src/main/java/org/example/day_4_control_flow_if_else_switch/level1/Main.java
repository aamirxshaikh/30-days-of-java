package org.example.day_4_control_flow_if_else_switch.level1;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//    Level: Beginner

    Scanner sc = new Scanner(System.in);

//    1. Write a program that takes three numbers as input from the user and determines the largest among them. Print the largest number to the console.

    int num1 = sc.nextInt(); // 10
    int num2 = sc.nextInt(); // 12
    int num3 = sc.nextInt(); // 13

    int largest = num1; // 10

    if (num2 > largest) { // 12 > 10 true
      largest = num2; // 12
    } if (num3 > largest) { // 13 > 12 true
      largest = num3; // 13
    }

    System.out.println(largest);

//    2. Write a program that takes a character as input from the user and determines if it is an uppercase letter, lowercase letter, or a digit. Print the corresponding message to the console.

    char ch = sc.next().charAt(0);

    if (Character.isLowerCase(ch)) {
      System.out.println("Lower case");
    } else if (Character.isUpperCase(ch)) {
      System.out.println("uppercase");
    } else if (Character.isDigit(ch)) {
      System.out.println("digit");
    } else {
      System.out.println("Character is not a lowercase letter, uppercase letter, or digit");
    }

//    3. Write a program that takes an integer as input from the user and checks if it is a prime number. Print "Prime" if the number is prime, and "Not prime" otherwise.

    int number = sc.nextInt();
    boolean isPrime = true;

    if (number <= 1) {
      isPrime = false;
    } else {
      for (int i = 2; i <= Math.sqrt(number); i++) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    System.out.println(isPrime ? "Prime" : "Not Prime");

    sc.close();
  }
}
