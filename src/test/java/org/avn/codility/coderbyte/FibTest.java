package org.avn.codility.coderbyte;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class FibTest {

    private Fib fib;

    @Rule
    public Timeout globalTimeOut;

    {
        final int timeInMinutes = 1000 * 2 * 1;
        globalTimeOut = new Timeout(timeInMinutes);
    }

    @Before
    public void generateFib() {
        fib = new Fib();
    }

    @Test//(timeout = 8000)
    public void testSolution_1() {
        Assert.assertEquals(fib.solution_1(3), 2);
        Assert.assertEquals(fib.solution_1(7), 13);
        Assert.assertEquals(fib.solution_1(9), 34);
        Assert.assertEquals(fib.solution_1(11), 89);
//        Assert.assertEquals(fib.solution_1(50),12586269025L);
//        Assert.assertEquals(fib.solution_1(150),12586269025L);
    }

    @Test(expected = StackOverflowError.class)
    public void testSolution_2_memoization() {
        Assert.assertEquals(fib.solution_2_memoization(3, makeLongArray(4)), 2);
        Assert.assertEquals(fib.solution_2_memoization(7, makeLongArray(8)), 13);
        Assert.assertEquals(fib.solution_2_memoization(9, makeLongArray(10)), 34);
        Assert.assertEquals(fib.solution_2_memoization(11, makeLongArray(12)), 89);
        Assert.assertEquals(fib.solution_2_memoization(50, makeLongArray(51)), 12586269025L);
        Assert.assertEquals(fib.solution_2_memoization(150, makeLongArray(151)), 6792540214324356296L);
        Assert.assertEquals(fib.solution_2_memoization(8979879, makeLongArray(8979880)), -3590794081851014494L);
        // Note above call will give StackOverflowError cause of big array size
    }

    @Test
    public void testSolution_3() {
        Assert.assertEquals(fib.solution_3(3), 2);
        Assert.assertEquals(fib.solution_3(7), 13);
        Assert.assertEquals(fib.solution_3(9), 34);
        Assert.assertEquals(fib.solution_3(11), 89);
        Assert.assertEquals(fib.solution_3(50), 12586269025L);
        Assert.assertEquals(fib.solution_3(150), 6792540214324356296L);
        Assert.assertEquals(fib.solution_3(750), -3370905699568403992L);
        Assert.assertEquals(fib.solution_3(8979879), -3590794081851014494L);
    }

    private Long[] makeLongArray(int sizeOfArray) {
        return new Long[sizeOfArray];
    }
}
//13699
//65042