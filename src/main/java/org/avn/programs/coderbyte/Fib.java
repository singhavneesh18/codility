package org.avn.programs.coderbyte;

/*
Index	0	1	2	3	4	5	6	7	8	9	10	11
Fib	0	1	1	2	3	5	8	13	21	34	55	89
Sum	0	1	1	4	7	12	20	33	54	88	143	232

 */

import java.util.Arrays;
import java.util.stream.IntStream;

public class Fib {

    public long solution_1(long n){
        if (n<= 2) return 1;
        return solution_1(n-1)+solution_1(n-2);
    }

    public long solution_2_memoization(final long n, Long[] memo) {
        final Long value = memo[(int) n];
        if (value != null) return value;
        if (n<= 2) return 1;
        memo[(int) n]= solution_2_memoization(n - 1, memo) + solution_2_memoization(n - 2, memo);
        return memo[(int) n];
    }

    public long solution_3(long n){
        if (n<= 2) return 1;
//        long result = 1;
        long arr[] = new long[]{1,1};
        for (int i = 2; i < n; i++) {
            arr[1] = arr[0] + arr[1];
            swapArrayValue(arr,0,1);
//            System.out.printf("arr[0] : %s\n", Arrays.toString(arr));
        }

        return arr[0];
    }

    private void swapArrayValue(long a[], int i, int j) {
        long t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
}
