package BasicKatas;

import java.util.Scanner;

/*
    Task
    In this challenge, you must read  integers from stdin and then print them to stdout.
    Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for
    you in the editor below.

    Input Format
    There are  lines of input, and each line contains a single integer.

    Sample Input
    42
    100
    125

    Sample Output
    42
    100
    125
*/
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstNumber = scanner.nextInt();
        int secondNumber = scanner.nextInt();
        int thirdNumber = scanner.nextInt();

        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(thirdNumber);
    }
}
