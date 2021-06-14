package org.example;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;

public class HighestNumber {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(3, 2, 2, 3, 7, 3, 5);
        IntSummaryStatistics stats = numbers.stream().mapToInt(x -> x).summaryStatistics();
        System.out.println(stats.getMin());
    }
}
