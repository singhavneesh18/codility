package org.avn.programs.codility;

public class FrogJmp {

    public int solution(int startPosition, int endPosition, int jumpDistance) {
        // write your code in Java SE 8

        int distanceToCover = endPosition -startPosition;
        int minJump = distanceToCover%jumpDistance;
        return (distanceToCover/jumpDistance) + (minJump ==0 ? 0 : 1);
    }
}
