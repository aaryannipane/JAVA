package code;


// Richest Customer Wealth
// https://leetcode.com/problems/richest-customer-wealth/


public class leetcode_1672 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1,5},
                {7,3},
                {3,5,7}
        };

        System.out.println(maximumWealth(accounts));

    }

    static int maximumWealth(int[][] accounts) {

        int maxWealth = 0;

        for(int[] person : accounts){
            int personWealth = 0;
            for(int acc : person){
                personWealth += acc;
            }

            maxWealth = Math.max(personWealth, maxWealth);
        }

        return maxWealth;

    }
}
