package org.avn.programs.codility.sorting;

import java.util.Arrays;

public class Distinct {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result =1;
        Arrays.sort(A);
        for(int i=1;i< A.length; i++)
            if (A[i] != A[i-1]) result++;
        // System.out.println(Arrays.toString(A)+ " =Length=> "+A.length);

        return A.length > 0 ? result: 0;
    }
}
