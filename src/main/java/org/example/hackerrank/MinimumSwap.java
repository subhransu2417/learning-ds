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

public class MinimumSwap {

    /*
     * Complete the 'minimumSwaps' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY popularity as parameter.
     */

    /*public static int minimumSwaps(List<Integer> popularity) {
        Integer array[] = popularity.toArray(new Integer[0]);
        int swapCount = 0;
        for (int i = 0; i < array.length; i++) {
            if(array[i]==i+1) continue;
            swapCount++;
            int temp = array[i];
            array[i] = array[temp-1];
            array[temp-1] = temp;
        }
        return swapCount;
    }*/

    public static int minimumSwaps(List<Integer> popularity) {
        Integer array[] = popularity.toArray(new Integer[0]);
        int n = array.length - 1;
        int swapCount = 0;
        for (int i = 0; i < n; i++) {
            if (i < array[i] - 1) {
                swap(array, i, Math.min(n, array[i] - 1));
                swapCount++;
                i--;
            }
        }
        return swapCount;
    }

    /*public static int minimumSwaps(List<Integer> popularity) {
        int swapCount = 0;
        Integer array[] = popularity.toArray(new Integer[0]);
        int arrayLength = array.length;
        Integer temp[] = Arrays.copyOfRange(array, 0, array.length);
        HashMap<Integer, Integer> h = new HashMap<>();

        Arrays.sort(temp);
        for (int i = 0; i < arrayLength ; i++) {
            h.put(array[i], i);
        }
        for (int i = 0; i < arrayLength; i++) {
            if(array[i] != temp[i]){
                swapCount++;
                int init = array[i];
                swap(array, i, h.get(temp[i]));
                h.put(init, h.get(temp[i]));
                h.put(temp[i], i);
            }
        }
        return swapCount;
    }*/

    private static void swap(Integer[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}

class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int popularityCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> popularity = IntStream.range(0, popularityCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int result = MinimumSwap.minimumSwaps(popularity);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}