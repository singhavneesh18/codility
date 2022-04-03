package org.avn.codility.codility.sorting;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NumberOfDiscIntersectionsTest {

    private NumberOfDiscIntersections numberOfDiscIntersections;

    @BeforeTest
    public void beforeTest() {
        numberOfDiscIntersections = new NumberOfDiscIntersections();
    }

    @DataProvider(name = "testSuite1")
    public Object[][] createData() {
        return new Object[][]{ //142110 // 041210
                new Object[]{new int[]{1, 5, 2, 1, 4, 0}, 11},
//                new Object [] { new int [] { 2, 1, 0, 4 }, 6 },
//                new Object [] { new int [] {  }, 0 },
//                new Object [] { new int [] { 1 }, 0 },
//                new Object [] { new int [] { 1, 2147483647, 0 }, 2 },
//                new Object [] { new int [] { 1, 7, 0,15 }, 5 },
//                new Object [] { new int [] { 5, 7, 0,15 }, 6 },
//                new Object [] { new int [] { 1,1,1 }, 3 },
//                new Object [] { new int [] { 2,2,2,2, 2 }, 10 },
//                new Object [] { new int [] { 1,1 }, 1 },
//                new Object [] { new int [] { 2,3 }, 1 },
//                new Object [] { new int [] { 6,6,6,6,6,6 }, 15 },
        };
    }

    @Test(dataProvider = "testSuite1")
    public void testSolution(int[] aInput, int aExpected) {
        Assert.assertEquals(numberOfDiscIntersections.solution(aInput), aExpected);
    }

    @Test(dataProvider = "testSuite1")
    public void testSolution_working_timeouts(int[] aInput, int aExpected) {
        Assert.assertEquals(numberOfDiscIntersections.solution_working_timeouts(aInput), aExpected);
    }

    @Test(dataProvider = "testSuite1")
    public void testSolution_working_81(int[] aInput, int aExpected) {
        Assert.assertEquals(numberOfDiscIntersections.solution_working_81(aInput), aExpected);
    }
}
