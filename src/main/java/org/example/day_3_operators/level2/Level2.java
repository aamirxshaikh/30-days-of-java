package org.example.day_3_operators.level2;

public class Level2 {
  public static void main(String[] args) {
//    Level: Intermediate

//    1. Create a variable count of type int and assign a value to it. Use the increment and decrement operators to perform the following operations and print the results:

    int count = 10;

//    a) Increment the value of count by 1 and assign it to a new variable incrementedCount.

    int incrementedCount = count + 1;

//    b) Decrement the value of count by 1 and assign it to a new variable decrementedCount.

    int decrementedCount = count - 1;

//    c) Print the value of count, incrementedCount, and decrementedCount to the console.

    System.out.println("Count : " + count);
    System.out.println("incrementedCount : " + incrementedCount);
    System.out.println("decrementedCount : " + decrementedCount);

//    2. Create two variables a and b of type double and assign values to them. Perform the following operations and print the results:

    double a = 10;
    double b = 10;

//    a) Multiply the value of a by 2 and assign it to b.

    b = a * 2;

//    b) Divide the value of b by 2 and assign it to a.

    a = b / 2;

//    c) Print the value of a and b to the console.

    System.out.println("a : " + a);
    System.out.println("b : " + b);

//    3. Create a variable percentage of type double and assign a value to it. Use the compound assignment operator to perform the following operations and print the results:

    double percentage = 90;

//    a) Increase the value of percentage by 10%.

    percentage += percentage * 0.1;
    System.out.println("Percentage increase by 10 % : " + percentage);

//    b) Decrease the value of percentage by 5%.

    percentage -= percentage * (0.1 / 2);
    System.out.println("Percentage decrease by 5 % : " + percentage);

//    c) Print the updated value of percentage to the console.

    System.out.println(percentage);
  }
}
