package org.avn.codility.codility;

public class FrogRiverOne {
    public int solution(int X, int[] A) {
        // write your code in Java SE 8
        // 1,3,2,3,1  X =3
        // 1,3,1,4,2,3,5,4  X = 5
        // 1,1,2,5,1,2,3,5,4    X = 5
        //
        // System.out.println("=================START=====================");
        int arr[] = new int[X + 1];
        int sum = X * (X + 1) / 2;
        int result = -1;
        // System.out.println("Total sum : "+ sum);
        for (int i = 0; i < A.length; i++) {
            if (arr[A[i]] == 0) {

                arr[A[i]] = A[i];
                sum = sum - A[i];
                // System.out.println("value : "+ A[i]+ "  sum : "+sum);
                if (sum == 0) {
                    result = i;
                    break;
                }
            }
        }

        return result;
    }
}
