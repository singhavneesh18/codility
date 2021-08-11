package org.avn.codility.codility.prefix.sums;


import org.junit.Assert;
import org.junit.Test;

public class CountDivTest {

    @Test
    public void testSolution() {
        final CountDiv countDiv = new CountDiv();
        System.out.println(countDiv.solution(0,1,1));
        Assert.assertEquals(countDiv.solution(0,1,1), 2);
    }
}
