package org.example.hackerrank;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;


public class SaleByMatchProblem {
    public static void main(String[] args) throws IOException {
        List<Integer> ar = Arrays.asList(10, 20, 20, 10, 10, 30, 50, 10, 20);
        sockMerchant(ar.size(), ar);
    }

    /*
     * Complete the 'sockMerchant' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY ar
     */

    public static int sockMerchant(int n, List<Integer> ar) {
        // Write your code here

        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (ar.get(i) == ar.get(j)) {
                    count++;
                    map.put(ar.get(i), count);
                }
            }
        }
        System.out.println("map = " + map);
        AtomicInteger total = new AtomicInteger();
        map.forEach((k, v) -> {
            int pairs = v / 2;
            total.set(total.get() + pairs);
        });
        System.out.println("total.get() = " + total.get());
        return total.get();
    }
}
