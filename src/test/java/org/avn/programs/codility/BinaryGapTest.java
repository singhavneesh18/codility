package org.avn.programs.codility;

import org.junit.Assert;
import org.junit.Test;


public class BinaryGapTest {



    @Test
    public void testSolution() {
        // 00, 01 10 11 100 101 110 111 1000 1001 1010
        final BinaryGap binaryGap = new BinaryGap();
        Assert.assertEquals(binaryGap.solution(5),1);
        Assert.assertEquals(binaryGap.solution(4),0);
        Assert.assertEquals(binaryGap.solution(6),0);
        Assert.assertEquals(binaryGap.solution(7),0);
        Assert.assertEquals(binaryGap.solution(8),0);
        Assert.assertEquals(binaryGap.solution(9),2);
        Assert.assertEquals(binaryGap.solution(10),1);
    }
}
