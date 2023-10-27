package org.example.day_3_operators.level1;

public class Main {
  public static void main(String[] args) {
//    Level: Beginner

//    1. Create two variables num1 and num2 of type int and assign values to them. Perform the following operations and print the results:

    int num1 = 5;
    int num2 = 3;

//    a) Addition of num1 and num2.

    int additionResult = num1 + num2;
    System.out.println("Addition: " + additionResult);

//    b) Subtraction of num1 from num2.

    int subtractionResult = num2 - num1;
    System.out.println("Subtraction: " + subtractionResult);

//    c) Multiplication of num1 and num2.

    int multiplicationResult = num1 * num2;
    System.out.println("Multiplication: " + multiplicationResult);

//    2. Create two variables a and b of type double and assign values to them. Perform the following operations and print the results:

    double a = 10.0;
    double b = 3.0;

//    a) Division of a by b.

    double divisionResult = a / b;
    System.out.println("Division: " + divisionResult);

//    b) Remainder of a divided by b.

    double remainder = a % b;
    System.out.println("Remainder: " + remainder);

//    c) Increment the value of a by 1 and assign it to b.

    b = ++a;
    System.out.println("Incremented a: " + a);
    System.out.println("Updated b: " + b);

//    3. Create two variables x and y of type int and assign values to them. Perform the following operations and print the results:

    int x = 100;
    int y = 200;

//    a) Increment the value of x by 1 and assign it to y.

    y = ++x;
    System.out.println("Increment y " + y);

//    b) Decrement the value of y by 1 and assign it to x.

    x = --y;
    System.out.println("Decrement x " + x);

//    c) Multiply the value of x by the value of y.

    int mulXAndY = x * y;
    System.out.println("Multiply x and y " + mulXAndY);
  }
}
