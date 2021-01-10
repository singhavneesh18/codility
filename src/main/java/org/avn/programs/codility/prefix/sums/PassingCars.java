package org.avn.programs.codility.prefix.sums;

public class PassingCars {
    public int solution(int[] A) {
        // write your code in Java SE 8
        int result = 0;
        int incrementCounter = 0;

        if (A[0] == 0) incrementCounter++;
        else A[0] = 0;

        for(int i=1; i< A.length; i++){
            if(A[i] == 0) {
                A[i] = A[i-1] + A[i];
                incrementCounter++;
            } else {
                if(incrementCounter > 0) A[i] = A[i - 1] + incrementCounter;
                else A[i] = 0;
            }
//             System.out.printf("A[%d]: %d",i,A[i]);
        }

        result = A[A.length -1];
        return result >= 0 && result<=  1000000000 ? result  : -1;
//        return result > 1000000000  || 0 < result? -1 : result;
    }
}
