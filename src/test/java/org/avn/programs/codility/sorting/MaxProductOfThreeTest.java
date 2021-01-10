package org.avn.programs.codility.sorting;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MaxProductOfThreeTest {

    private MaxProductOfThree solution;

    @BeforeTest
    public void setUp() {
        solution = new MaxProductOfThree();
    }

    @DataProvider(name = "test1")
    public Object [][] createData1() {
        return new Object [][] {
                new Object [] {  new int [] { -3, 1, 2, -2, 5, 6  }, 60 }, //2 * 5 * 60
                new Object [] {  new int [] { -3, 1, -100, 2, -2, 5, 6  }, 1800 }, //-100 * -3 * 6
                new Object [] {  new int [] { -3, 1, -100}, 300},
                new Object [] {  new int [] { -3, 1, 0, -100}, 300}, //-100 * -3 * 1
                new Object [] {  new int [] { -3, 1, 2, 0, -100}, 600},  //-100 * -3 * 2
                new Object [] {  new int [] { 10, 10, 10 }, 1000 },
                new Object [] {  new int [] { -5, 5, -5, 4 }, 125 },
        };
    }

    @Test(dataProvider = "test1")
    public void verifySolution2(int[] pA, int pExpected) {
        Assert.assertEquals(solution.solution(pA),pExpected);
    }
}
