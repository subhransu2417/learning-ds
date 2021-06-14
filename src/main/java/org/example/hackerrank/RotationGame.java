package org.example.hackerrank;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.util.stream.Collectors.toList;

public class RotationGame {

    /*
     * Complete the 'getMaxElementIndexes' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY rotate
     */

    public static List<Integer> getMaxElementIndexes(List<Integer> a, List<Integer> rotate) {
        // Write your code here
        int array[] = a.stream().mapToInt(i->i).toArray();
        int[] resultArray = new int[0];
        int indeces = 0;
        for(int val: rotate){
            int rotatedArr[] = rotateArray(array, val);
            int maxValue = Arrays.stream(rotatedArr).max().getAsInt();
            for (int i = 0; i < array.length; i++) {
                if(array[i] == maxValue){
                    resultArray[indeces] = i;
                    indeces++;
                }
            }
        }
        System.out.println(resultArray);
        Arrays.stream(resultArray).boxed().toArray((Integer[]::new));
        return Arrays.stream(resultArray).boxed().collect(Collectors.toList());
    }

    private static int[] rotateArray(int[] arr, int d){
        int n = arr.length;
        int[] rotated = new int[n];
        System.arraycopy(arr, d, rotated, 0, n-d);
        System.arraycopy(arr, 0, rotated, n-d, d);
        return rotated;
    }
    

}

class Solution1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int aCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> a = IntStream.range(0, aCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        int rotateCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> rotate = IntStream.range(0, rotateCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine().replaceAll("\\s+$", "");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
                .map(String::trim)
                .map(Integer::parseInt)
                .collect(toList());

        List<Integer> result = RotationGame.getMaxElementIndexes(a, rotate);

        System.out.println(result);

        bufferedReader.close();
    }
}