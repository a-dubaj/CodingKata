package BasicKatas;

import java.util.Scanner;

/*
Task:
Given an integer, n, perform the following conditional actions:

If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of 6 to 20, print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Input Format
A single line containing a positive integer, n.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        String answerer = "";
        if (number % 2 == 1) {
            answerer = "Weird";
        } else {
            if (number >= 6 && number <= 20) answerer = "Weird";
            else
                answerer = "Not Weird";
        }
        System.out.println(answerer);
    }
}
