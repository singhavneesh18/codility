package org.avn.codility.codility.prefix.sums;

public class GenomicRangeQuerySol2 {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int[] C = new int[P.length];
        for (int i = 0; i < P.length; i++) {
            C[i] = factor(S, P[i], Q[i]);
        }

        return C;
    }

    public int factor(String S, int i, int j) {
        if (S.substring(i, j + 1).contains("A")) {
            return 1;
        } else if (S.substring(i, j + 1).contains("C")) {
            return 2;
        } else if (S.substring(i, j + 1).contains("G")) {
            return 3;
        }

        return 4;
    }
}
