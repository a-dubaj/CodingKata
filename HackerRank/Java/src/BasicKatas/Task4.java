package BasicKatas;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/*
    Task
    Given an integer,N, print its first  multiples. Each multiple N x i  (where i <= i <= 10) should be
    printed on a new line in the form: N x i = result.

    Input Format
    A single integer, N.

    Constraints
    2 <= N <= 20
    Output Format
    Print N lines of output; each line i (where 1 <= i <=10) contains the result of N x i  in the form:
    N x i = result.
*/

public class Task4 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(bufferedReader.readLine().trim());

        bufferedReader.close();
    }
}
