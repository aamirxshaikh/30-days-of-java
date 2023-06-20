package org.example.day_3_operators.level3;

public class Level3 {
  public static void main(String[] args) {
//    Level: Advanced

//    1. Create two variables isSunny and isRainy of type boolean and assign values to them. Perform the following logical operations and print the results:

    boolean isSunny = true;
    boolean isRainy = false;

//    a) Logical AND operation between isSunny and isRainy.

    System.out.println("and : " + (isSunny && isRainy));

//    b) Logical OR operation between isSunny and isRainy.

    System.out.println("or : " + (isSunny || isRainy));

//    c) Logical NOT operation on isSunny.

    System.out.println("not : " + (!isSunny));

//    2. Create a variable number of type int and assign a value to it. Write a program that checks if the number is positive and assigns the result to a variable named isPositive.

    int var = 5;
    boolean isPositive = false;

    if (var > 0) {
      isPositive = true;
    } else {
      isPositive = false;
    }

//    a) Print the value of the isPositive variable to the console.

    System.out.println("Is positive : " + isPositive);

//    3. Create a variable age of type int and assign a value to it. Write a program that checks if the person is eligible to vote (age is 18 or above) and assigns the result to a variable named isEligibleToVote.

    int age = 23;
    boolean isEligibleToVote;

    if (age >= 18) {
      isEligibleToVote = true;
    } else {
      isEligibleToVote = false;
    }

//    a) Print the value of the isEligibleToVote variable to the console.

    System.out.println("isEligibleToVote : " + isEligibleToVote);
  }
}
