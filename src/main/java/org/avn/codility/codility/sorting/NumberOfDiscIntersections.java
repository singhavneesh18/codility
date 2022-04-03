package org.avn.codility.codility.sorting;

import java.util.Arrays;

public class NumberOfDiscIntersections {

    public int solution(int[] A) {
        long result = 0;
        int length = A.length;
        for (int i = 0; i < A.length; i++) {
            // check on right hand side
            final int i1 = length - 1 - i;
            int toRight = A[i] >= i1 ? i1 : A[i];
            int toLeft = 0;
            for (int l = 0; l < i; l++) {
                final int i2 = A[l] + l - i;
                final boolean alreadyIntersect = i2 >= 0;
                if (A[i] + i2 >= 0 && !alreadyIntersect) {
                    toLeft++;
                }
            }
            result += toRight + toLeft;
        }

        return (result > 10000000) ? -1 : (int) result;
    }


    /*
    100% correct
    Task Score 62%
    Performance 25%
     */
    public int solution_working_timeouts(int[] A) {
        long result = 0;
        int length = A.length;
        for (int i = 0; i < A.length; i++) {
            // check on right hand side
            final int i1 = length - 1 - i;
            int toRight = A[i] >= i1 ? i1 : A[i];
            int toLeft = 0;
            for (int l = 0; l < i; l++) {
                final int i2 = A[l] + l - i;
                final boolean alreadyIntersect = i2 >= 0;
                if (A[i] + i2 >= 0 && !alreadyIntersect) {
                    toLeft++;
                }
            }
            result += toRight + toLeft;
        }

        return (result > 10000000) ? -1 : (int) result;

    }

    // https://github.com/ZRonchy/Codility/blob/master/Lesson4/NumberOfDiscIntersections.java
    public int solution_working_81(int[] A) {
        // write your code in Java SE 8
        int n = A.length;
        int sum = 0;
        int interect = 0;
        long total = (long) n * (n - 1) / 2;
        for (int i = 0; i < n; i++) {
            for (int right = i + 1; right < n; right++) {
                if (right - A[i] - i > A[right]) { //right>A[i]+i+A[right] will cause overflow
                    sum++;
                }
            }
        }
        if ((long) (total - sum) > 10000000) {
            return -1;
        }
        return (int) (total - sum);

    }

    public int solution_not_working_1(int[] A) {
        // write your code in Java SE 8
        long result = 0;
        if (A.length == 1 || A.length == 0)
            return (int) result;
        if (A.length == 2)
            return 1;

        int[] temp = new int[A.length];
        temp[0] = A[0] < A[1] ? 0 : A[0];
        for (int i = 1; i < A.length; i++) {
            final boolean condition1 = A[i] - A[i - 1] > 0;
            final boolean isLast = i == A.length - 1;
            if (condition1 || isLast) {
                temp[i] = A[i];
            } else {
                final boolean condition2 = A[i] - A[i + 1] > 0;
                temp[i] = (condition2) ? A[i] : 0;
            }
            if (temp[i] >= A.length) {
                temp[i] = A.length - 1;
            }
        }
        System.out.println("Input: " + Arrays.toString(A) + ", output: " + Arrays.toString(temp));
        result = Arrays.stream(temp).sum();
        return (int) (result > 10000000L ? -1 : result);
    }
}
