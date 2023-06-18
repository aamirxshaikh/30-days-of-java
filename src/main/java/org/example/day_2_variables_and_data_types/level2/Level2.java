package org.example.day_2_variables_and_data_types.level2;

public class Level2 {
  public static void main(String[] args) {
//    Level: Intermediate

//    1. Create two variables named length and width of type double and assign values to them representing the length and width of a rectangle.
//    a. Calculate the area of the rectangle (length * width) and store it in a variable named area.
//    b. Print the value of the area variable to the console.

    double length = 10, width = 20;
    double area = length * width;
    System.out.println(area);

//    2. Create two variables named length and width of type double and assign values to them representing the length and width of a rectangle.
//    a. Calculate the perimeter of the rectangle (2 * length + 2 * width) and store it in a variable named perimeter.
//    b. Print the value of the perimeter variable to the console.

    double perimeter = 2 * length + 2 * width;
    System.out.println(perimeter);

//    3. Create a variable named radius of type double and assign a value representing the radius of a circle.
//    a. Calculate the circumference of the circle (2 * Math.PI * radius) and store it in a variable named circumference.
//    b. Print the value of the circumference variable to the console.

    double radius = 3;
    double circumference = 2 * Math.PI * radius;
    System.out.println(circumference);
  }
}
