package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FizzBuzzProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        int i = Integer.parseInt(bufferedReader.readLine());
        for (int j = 1; j <= i; j++) {
            if (((j % 3) == 0) && ((j % 5) == 0)) {
                System.out.println("FizzBuzz");
            } else if ((j % 3) == 0) {
                System.out.println("Fizz");
            } else if ((j % 5) == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(j);
            }
        }
    }
}
