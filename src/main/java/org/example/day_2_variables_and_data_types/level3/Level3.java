package org.example.day_2_variables_and_data_types.level3;

public class Level3 {
  public static void main(String[] args) {
//    Level: Advanced

//     1. Create a variable named isPrime of type boolean and assign a boolean value indicating whether a given number is prime or not.
//     a.  Write a program that checks if a number is prime and assigns the result to the isPrime variable.
//     b. Print the value of the isPrime variable to the console.

    int number = 7;
    boolean isPrime = true;

    if (number <= 1) {
      isPrime = false;
    } else if (number == 2) {
      isPrime = true;
    } else if (number % 2 == 0) {
      isPrime = false;
    } else {
      for (int i = 3; i <= Math.sqrt(number); i += 2) {
        if (number % i == 0) {
          isPrime = false;
          break;
        }
      }
    }

    System.out.println("Is Prime " + isPrime);

//    2. Create a variable named number of type int and assign a value to it. Write a program that checks if the number is even and assigns the result to a variable named isEven.
//    a. Print the value of the isEven variable to the console.

    boolean isEven = false;

    if (number % 2 == 0) {
      isEven = true;
    }

    System.out.println("Is Even " + isEven);

//    3. Create a variable named year of type int and assign a value representing a year. Write a program that checks if the year is a leap year and assigns the result to a variable named isLeapYear.
//    a. Print the value of the isLeapYear variable to the console.

    int year = 2023;
    boolean isLeapYear = false;

    if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      isLeapYear = true;
    }

    System.out.println("Is Leap Year " + isLeapYear);
  }
}
