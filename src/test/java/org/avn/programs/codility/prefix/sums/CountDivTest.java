package org.avn.programs.codility.prefix.sums;

import org.avn.programs.codility.prefix.sums.CountDiv;
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
