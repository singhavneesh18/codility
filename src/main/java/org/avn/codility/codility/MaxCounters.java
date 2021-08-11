package org.avn.codility.codility;

public class MaxCounters {
    public int[] solution(int N, int[] A) {
        int[] result = new int[N];
        int maxCounter = 0;
        boolean gotMaxFlag = false;
        int lastMaxCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] >= 1 && A[i] <= N) {
                if (gotMaxFlag && (result[A[i] - 1] < lastMaxCounter)) {
                    result[A[i] - 1] = lastMaxCounter;
                }
                result[A[i] - 1] += 1;

                if (result[A[i] - 1] > maxCounter) {
                    maxCounter = result[A[i] - 1];
                }
            } else {
                // Arrays.fill(result,maxCounter);
                gotMaxFlag = true;
                lastMaxCounter = maxCounter;
            }
            //  System.out.println(Arrays.toString(result));
        }
        for (int i = 0; i < result.length && gotMaxFlag; i++) {
            if (result[i] < lastMaxCounter) {
                result[i] = lastMaxCounter;
            }
        }
        // System.out.println(Arrays.toString(result));
        return result;
    }
}
