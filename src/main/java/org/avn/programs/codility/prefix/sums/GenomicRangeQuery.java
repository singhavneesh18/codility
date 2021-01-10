package org.avn.programs.codility.prefix.sums;

import java.util.Map;
import java.util.regex.Pattern;

public class GenomicRangeQuery {
    public int[] solution(String context, int[] p, int[] q) {
        // write your code in Java SE 8
      /*  Map<String, Integer> map = new HashMap<>();
        map.put("A", 1);
        map.put("C", 2);
        map.put("G", 3);
        map.put("T", 4);*/

        int result[] = new int[p.length];
        for (int a = 0; a < p.length; a++) {
//            String temp = context.substring(p[i], q[i]+1);
//            result[i] = getMinimumFactor(map,temp);
            int i = p[a];
            int j = q[a];
            if (context.substring(i, j + 1).contains("A")) {
                result[i] = 1;
            } else if (context.substring(i, j + 1).contains("C")) {
                result[i] = 2;
            } else if (context.substring(i, j + 1).contains("G")) {
                result[i] = 3;
            } else {
                result[i] = 4;
            }


        }

        return result;
    }

    private int getMinimumFactor(Map<String, Integer> map, String content) {
        int result = 1;
        for (Map.Entry<String, Integer> e : map.entrySet()) {
            // System.out.printf("Entry key: %s, value: %d\n",e.getKey(), e.getValue());
            if (Pattern.matches(".*" + e.getKey() + ".*", content)) {
                result = e.getValue();
//                break;
            }
        }
        return result;
    }
}
