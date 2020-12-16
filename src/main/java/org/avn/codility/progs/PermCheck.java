package org.avn.codility.progs;

import java.util.HashSet;
import java.util.Set;

public class PermCheck {
    public int solution(int[] A) {
        // write your code in Java SE 8
        if (A.length == 0) {
            return 0;
        }

        Set<Integer> set = new HashSet<>();
        for (int i= 0; i<A.length;i++) {
            set.add(A[i]);
        }

        for (int i=1; i<= A.length; i++) {
            if(!set.contains(i)){
                return 0;
            }
        }

        return 1;
    }
}
