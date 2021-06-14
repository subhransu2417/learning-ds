package org.example.hackerrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;

public class BalancedDelimeterProblem {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String str = in.readLine();
        Deque<Character> queue = new ArrayDeque<Character>();

        boolean isBlanced = true;

        char[] delim = str.toCharArray();
        for (char c : delim) {
            if (c == '{' || c == '[' || c == '(') {
                queue.push(c);
                continue;
            }
            if (queue.isEmpty())
                isBlanced = false;
            char check;
            switch (c) {
                case ')':
                    check = queue.pop();
                    if (check == '{' || check == '[')
                        isBlanced = false;
                    break;

                case '}':
                    check = queue.pop();
                    if (check == '(' || check == '[')
                        isBlanced = false;
                    break;

                case ']':
                    check = queue.pop();
                    if (check == '(' || check == '{')
                        isBlanced = false;
                    break;
            }
        }
        if(queue!= null && !queue.isEmpty()){
            isBlanced = false;
        }
        System.out.println(isBlanced ? "True" : "False");
    }
}
