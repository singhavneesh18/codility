package org.avn.codility.progs;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
        while(true){
            if(matcher.find(startIndexOfPatternSearch)){
                int currentLength = matcher.group(2).length();
                // System.out.println("===Content found===>"+matcher.group(2));
                if(maxLength< currentLength){
                    maxLength = currentLength;
                    // System.out.println("===Match found===>"+maxLength);
                }
                startIndexOfPatternSearch = matcher.end()-1;
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
        for(int i = 0; i< content.length(); i++){
            if("1".equals(""+(char)content.charAt(i))){
                maxLength = Math.max(maxLength,currentLengthCounter);
                currentLengthCounter = 0;
            } else{
                currentLengthCounter++;
            }
        }


        return maxLength;
    }
}
