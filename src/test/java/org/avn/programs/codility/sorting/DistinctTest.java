package org.avn.programs.codility.sorting;

import org.junit.Assert;
import org.junit.Test;

public class DistinctTest {

    @Test
    public void testDistinctSolution(){
        final Distinct distinct = new Distinct();
        Assert.assertEquals(distinct.solution(new int[]{2, 1, 1, 2, 3, 1}),3);
        Assert.assertEquals(distinct.solution(new int[]{-10000, 1, -35, -4845, 54, 0, -5641, 87, 16, 316, -35}),10);
        Assert.assertEquals(distinct.solution(new int[]{}),0);
        Assert.assertEquals(distinct.solution(new int[]{1}),1);
        Assert.assertEquals(distinct.solution(new int[]{1,1}),1);
        Assert.assertEquals(distinct.solution(new int[]{1,2,2}),2);
    }
}
