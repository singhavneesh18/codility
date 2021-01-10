package org.avn.programs.coderbyte;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

public class GridTravellerTest {

    private GridTraveller gridTraveller;

    @Rule
    public Timeout timeout;

    {
        timeout = new Timeout(1000 * 60 *5);
    }

    @Before
    public void setUp() throws Exception {
        gridTraveller = new GridTraveller();
    }

    @Test
    public void testGTSolution_1() {
        Assert.assertEquals(gridTraveller.solution_1(2,2), 2L);
        Assert.assertEquals(gridTraveller.solution_1(1,2), 1L);
        Assert.assertEquals(gridTraveller.solution_1(1,1), 1L);
        Assert.assertEquals(gridTraveller.solution_1(2,1), 1L);
        Assert.assertEquals(gridTraveller.solution_1(3,3), 6L);
        Assert.assertEquals(gridTraveller.solution_1(4,3), 10L);
        Assert.assertEquals(gridTraveller.solution_1(14,3), 105L);
        Assert.assertEquals(gridTraveller.solution_1(14,25), 3562467300L);
//        Assert.assertEquals(gridTraveller.solution_1(25,25), 3562467300L);
    }

    @Test
    public void testGTSolution_3() {
        Assert.assertEquals(gridTraveller.solution_3(2,2), 2L);
        Assert.assertEquals(gridTraveller.solution_3(1,2), 1L);
        Assert.assertEquals(gridTraveller.solution_3(1,1), 1L);
        Assert.assertEquals(gridTraveller.solution_3(2,1), 1L);
        Assert.assertEquals(gridTraveller.solution_3(3,3), 6L);
        Assert.assertEquals(gridTraveller.solution_3(4,3), 10L);
        Assert.assertEquals(gridTraveller.solution_3(14,3), 105L);
        Assert.assertEquals(gridTraveller.solution_3(14,25), 3562467300L);
//        Assert.assertEquals(gridTraveller.solution_1(25,25), 3562467300L);
    }

    @Test
    public void testGTSolution_2() {
        Assert.assertEquals(gridTraveller.solution_2(2,2,getMemo(2,2)), 2L);
        Assert.assertEquals(gridTraveller.solution_2(1,2,getMemo(1,2)), 1L);
        Assert.assertEquals(gridTraveller.solution_2(1,1,getMemo(1,1)), 1L);
        Assert.assertEquals(gridTraveller.solution_2(2,1,getMemo(2,1)), 1L);
        Assert.assertEquals(gridTraveller.solution_2(3,3,getMemo(3,3)), 6L);
        Assert.assertEquals(gridTraveller.solution_2(4,3,getMemo(4,3)), 10L);
        Assert.assertEquals(gridTraveller.solution_2(14,3,getMemo(14,3)), 105L);
        Assert.assertEquals(gridTraveller.solution_2(14,25,getMemo(14,25)), 3562467300L);
//        Assert.assertEquals(gridTraveller.solution_1(25,25), 3562467300L);
    }

    private Long[] getMemo(int m, int n) {
        return new Long[(m*n)+1];
    }
}