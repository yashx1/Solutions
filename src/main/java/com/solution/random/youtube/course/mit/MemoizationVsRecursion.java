package com.solution.random.youtube.course.mit;

import java.time.Instant;
import java.util.HashMap;
import java.util.Map;

/**
 * Reference : Dynamic Programming I: Fibonacci, Shortest Paths
 * Source : https://www.youtube.com/watch?v=OQ5jsbhAv_M
 **/

public class MemoizationVsRecursion {
    static Map<Long, Long> map = new HashMap<>(100);

    static {
        map.put((long)1, (long)1);
        map.put((long)2, (long)1);
    }

    public static void main(String[] args) {
        long n = 50;
        MemoizationVsRecursion memoizationVsRecursion = new MemoizationVsRecursion();
        Instant startRec = Instant.now();
        System.out.println("fibnocciViaRecursion : " + memoizationVsRecursion.fibnocciViaRecursion(n));
        Instant endRec = Instant.now();
        System.out.println("Time taken in fibnocciViaRecursion : " + (endRec.toEpochMilli() - startRec.toEpochMilli()));

        System.out.println("\n\n\n");

        Instant startMemo = Instant.now();
        System.out.println("fibonocciViaMemoization : " + memoizationVsRecursion.fibonocciViaMemoization(n));
        Instant endMemo = Instant.now();
        System.out.println("Time taken in fibonocciViaMemoization : " + (endMemo.toEpochMilli() - startMemo.toEpochMilli()));
    }

    public long fibnocciViaRecursion(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return fibnocciViaRecursion(n - 1) + fibnocciViaRecursion(n - 2);
    }


    public long fibonocciViaMemoization(long n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        long i = 3;
        while (i <= n) {
            if (map.containsKey(n)) {
                return map.get(i);
            } else {
                map.put(i, map.get(i - 1) + map.get(i - 2));
            }
            i++;
        }

        return map.get(n);
    }
}