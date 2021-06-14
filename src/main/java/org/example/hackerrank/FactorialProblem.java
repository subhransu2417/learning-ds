package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FactorialProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());
        int fact = 1;
        while(input > 0){
            fact = fact * input;
            input --;
        }
        System.out.println(fact);
    }
}
