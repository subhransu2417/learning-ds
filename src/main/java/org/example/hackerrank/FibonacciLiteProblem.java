package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FibonacciLiteProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(in.readLine());
        int i = 0;
        int j = 1;
        int k = 0;
        int counter = 0;
        while (counter < input){
            k = i +j;
            i=j;
            j=k;
            counter++;
        }
        System.out.println(i);
        /*for (int x = 1; x < input; x++) {
            k = i + j;
            i = j;
            j = k;
        }
        System.out.println("k = " + k);*/
    }
}
