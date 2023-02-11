/*
  
    You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.

    A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth.


    Input: accounts = [[1,5],[7,3],[3,5]]
    Output: 10
    Explanation: 
    1st customer has wealth = 6
    2nd customer has wealth = 10 
    3rd customer has wealth = 8
    The 2nd customer is the richest with a wealth of 10.
    
 */

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        int[][] accounts = {
                { 2, 8, 7 },
                { 7, 1, 3 },
                { 1, 9, 5 }
        };

        int ans = maximumWealth(accounts);
        System.out.println(ans);
    }

    public static int maximumWealth(int[][] acc) {
        ArrayList<Integer> sumOfAcc = new ArrayList<Integer>();
        for (int row = 0; row < acc.length; row++) {
            int sum = 0;
            for (int col = 0; col < acc[row].length; col++) {
                sum = sum + acc[row][col];
            }
            sumOfAcc.add(sum);
        }
        int maxAmount = max(sumOfAcc);
        return maxAmount;
    }

    public static int max(ArrayList<Integer> arr) {
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (max < arr.get(i)) {
                max = arr.get(i);
            }
        }
        return max;
    }
}
