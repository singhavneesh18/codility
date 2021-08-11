package org.avn.codility.codility;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at both ends in the binary representation of N.
 * <p>
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2. The number 529 has binary representation 1000010001 and contains two binary gaps: one of length 4 and one of length 3. The number 20 has binary representation 10100 and contains one binary gap of length 1. The number 15 has binary representation 1111 and has no binary gaps. The number 32 has binary representation 100000 and has no binary gaps.
 * <p>
 * Write a function:
 * <p>
 * class Solution { public int solution(int N); }
 * <p>
 * that, given a positive integer N, returns the length of its longest binary gap. The function should return 0 if N doesn't contain a binary gap.
 * <p>
 * For example, given N = 1041 the function should return 5, because N has binary representation 10000010001 and so its longest binary gap is of length 5. Given N = 32 the function should return 0, because N has binary representation '100000' and thus no binary gaps.
 * <p>
 * Write an efficient algorithm for the following assumptions:
 * <p>
 * N is an integer within the range [1..2,147,483,647].
 */
public class BinaryGap {
    public int solution(int N) {
        // write your code in Java SE 8

        return regexSolution(N);
//        return loopSolution(N);
    }

    public int regexSolution(int N) {
        String content = Integer.toBinaryString(N);
        // System.out.println("======>"+content);
        Pattern pattern = Pattern.compile("([1])([0]+)\\1");
        Matcher matcher = pattern.matcher(content);
        int maxLength = 0;
        int startIndexOfPatternSearch = 0;
        while (true) {
            if (matcher.find(startIndexOfPatternSearch)) {
                int currentLength = matcher.group(2).length();
                // System.out.println("===Content found===>"+matcher.group(2));
                if (maxLength < currentLength) {
                    maxLength = currentLength;
                    // System.out.println("===Match found===>"+maxLength);
                }
                startIndexOfPatternSearch = matcher.end() - 1;
                // System.out.println("===startIndexOfPatternSearch===>"+startIndexOfPatternSearch);
            } else {
                break;
            }
        }

        return maxLength;
    }


    public int loopSolution(int N) {
        int maxLength = 0;
        String content = Integer.toBinaryString(N);
        // System.out.println("======>"+content);
        // char[] temp = content.toCharArray();
        // String[] stringArray = new String[temp.length];
        // int i=0;
        int currentLengthCounter = 0;
        // boolean isCompleted = false;
        for (int i = 0; i < content.length(); i++) {
            if ("1".equals("" + (char) content.charAt(i))) {
                maxLength = Math.max(maxLength, currentLengthCounter);
                currentLengthCounter = 0;
            } else {
                currentLengthCounter++;
            }
        }


        return maxLength;
    }
}
