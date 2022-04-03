package org.avn.codility.codility.sorting;

import java.util.Arrays;

public class MaxProductOfThree {

    public int solution(int[] A) {
        if (A.length == 2) {
            return A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        }
        Arrays.sort(A);
        int prod1 = A[A.length - 3] * A[A.length - 2] * A[A.length - 1];
        int prod2 = A[A.length - 1] * A[0] * A[1];

        return Math.max(prod1, prod2);
    }
}
