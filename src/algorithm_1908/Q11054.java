package algorithm_1908;

import sun.nio.cs.ext.MacHebrew;

import java.util.Scanner;

public class Q11054 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] dp = new int[2][n+1];
        int[] cost = new int[n+1];

        for(int i=1; i<=n; i++){
            cost[i] = sc.nextInt();
        }

        dp[1][n] = 1;
        dp[0][1] = 1;
        for(int i=n-1; i>0; i--){
            dp[1][i] = 1;
            for(int j=n; j>1; j--){
                if(cost[i] > cost[j]){
                    dp[1][i] = Math.max(dp[1][i], dp[1][j]+1);
                }
            }
        }

        for(int i=2; i<=n; i++){
            dp[0][i] = 1;
            for(int j=1; j<i; j++){
                if(cost[i] > cost[j]){
                    dp[0][i] = Math.max(dp[0][i], dp[0][j]+1);
                }
            }
        }

        int max = Integer.MIN_VALUE;
        for(int i=1; i<=n; i++){
            dp[0][i] += dp[1][i];
        }

        for(int i=1; i<=n; i++){
            if(dp[0][i] > max){
                max = dp[0][i];
            }
        }

        System.out.println(max - 1);
    }
}
