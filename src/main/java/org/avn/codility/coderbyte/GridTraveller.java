package org.avn.codility.coderbyte;

/*
There is a grid which will have m = number of rows
n= number of columns
In Beginning traveller is at position 1,1
Need to find ways to reach right-down end
For Ex:
-----------
3,3	3,2 3,1
2,3	2,2	2,1
1,3	1,2	1,1
if input is (2,3) then output will be 3 ways
if input is (1,3) then output will be 1 ways
if input is (2,2) then output will be 2 ways
if input is (3,3) then output will be 10 ways

---------------------------------------
Solution Notes
0,n or n,0 ==> Invalid nodes
1,1 =>  1


 */
public class GridTraveller {

    public long solution_1(int m, int n){
        if (m == 1 && n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return solution_1(m-1,n) + solution_1(m,n-1);
    }

    public long solution_3(int m, int n){
        if (m == 1 || n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        return solution_3(m-1,n) + solution_3(m,n-1);
    }

    public long solution_2(int m, int n, Long[] memo){
        if (m == 1 || n == 1) return 1;
        if (m == 0 || n == 0) return 0;
        if (memo[m*n] != null) return memo[m*n];
        memo[m*n] = solution_2(m - 1, n, memo) + solution_2(m, n - 1, memo);
        return memo[m*n];
    }
}
