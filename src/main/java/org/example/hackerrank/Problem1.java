package org.example.hackerrank;

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



class Problem1 {

    /*
     * Complete the 'fizzBuzz' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void fizzBuzz(int n) {
        if(n == 3 && n == 5){
            System.out.println("FizzBuzz");
        } else if(n == 3){
            System.out.println("Fizz");
        } else if(n == 5){
            System.out.println("Buzz");
        } else {
            System.out.println(n);
        }

    }

    public static class Solution {
        public static void main(String[] args) throws IOException {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

            int n = Integer.parseInt(bufferedReader.readLine().trim());

            Problem1.fizzBuzz(n);

            bufferedReader.close();
        }
    }
}

