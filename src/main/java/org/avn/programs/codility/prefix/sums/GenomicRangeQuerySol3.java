package org.avn.programs.codility.prefix.sums;

public class GenomicRangeQuerySol3 {
    public int[] solution(String S, int[] P, int[] Q) {
        // write your code in Java SE 8
        int countArr[][]=new int[3][S.length()+1];
        int result[] = new int[P.length];
        for (int i=0;i<S.length();i++) {
            short a=0,c=0,g=0;

            if('A' == S.charAt(i)){
                a=1;
            } else if('C' == S.charAt(i)){
                c=1;
            } else if('G' == S.charAt(i)){
                g=1;
            }
            countArr[0][i+1] = countArr[0][i] + a;
            countArr[1][i+1] = countArr[1][i] + c;
            countArr[2][i+1] = countArr[2][i] + g;
            /*System.out.println("i= "+(i+1)+
            ", countArr[0][i+1]: "+countArr[0][i+1]+
            ", countArr[1][i+1] : "+countArr[1][i+1]+
            ", countArr[2][i+1]: "+countArr[2][i+1]);*/
        }

        for (int i=0; i<P.length; i++){
            int startIndex = P[i];
            int endIndex = Q[i]+1;
            // System.out.printf("startIndex: %d, endIndex: %d\n", startIndex, endIndex);
            if(countArr[0][endIndex] - countArr[0][startIndex] > 0){
                result[i] = 1;
            }else if(countArr[1][endIndex] - countArr[1][startIndex] > 0){
                result[i] = 2;
            }else if(countArr[2][endIndex] - countArr[2][startIndex] > 0){
                result[i] = 3;
            } else {
                result[i] = 4;
            }


        }

        return result;
    }
}
