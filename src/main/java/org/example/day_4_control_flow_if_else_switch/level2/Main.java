package org.example.day_4_control_flow_if_else_switch.level2;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
//    Level: Intermediate

    Scanner sc = new Scanner(System.in);

//    1. Write a program that takes a sentence as input from the user and counts the number of vowels (a, e, i, o, u) in the sentence. Print the count to the console.

    System.out.println("Enter a sentence to calculate vowels");
    String sentence = sc.nextLine().toLowerCase();
    int vowelCount = 0;

    for (int i = 0; i < sentence.length(); i++) {
      if (sentence.charAt(i) == 'a' || sentence.charAt(i) == 'e' || sentence.charAt(i) == 'i' || sentence.charAt(i) == 'o' || sentence.charAt(i) == 'u') {
        vowelCount++;
      }
    }

    System.out.println("Number of vowels are " + vowelCount);


//    2. Write a program that takes a string as input from the user and checks if it is a palindrome (reads the same forwards and backwards). Print "Palindrome" if the string is a palindrome, and "Not a palindrome" otherwise.

    System.out.println("Enter a sentence to calculate palindrome");
    String str = sc.nextLine().toLowerCase();
    StringBuilder reversed = new StringBuilder(str).reverse();

    if (str.equalsIgnoreCase(reversed.toString())) {
      System.out.println("Palindrome");
    } else {
      System.out.println("Not a palindrome");
    }

//    3. Write a program that generates a random number between 1 and 100. Allow the user to make guesses and provide feedback (higher or lower) until they guess the correct number. Print the number of attempts to the console.
  }
}
