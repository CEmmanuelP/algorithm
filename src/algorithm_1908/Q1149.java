package algorithm_1908;

import java.util.Scanner;

public class Q1149 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[][] P = new int[n][3];

        int min = Integer.MAX_VALUE;

        for(int i=0; i<n; i++){
            for(int j=0; j<3; j++){
                P[i][j] = sc.nextInt();
            }
        }

        for(int i=1; i<n; i++){
            for(int j=0; j<3; j++){
                P[i][j] = P[i][j] + Math.min(P[i-1][(j+1)%3], P[i-1][(j+2)%3]);
            }
        }

        if(P[n-1][0] <= P[n-1][1] && P[n-1][0] <= P[n-1][2]){
            min = P[n-1][0];
        }else if(P[n-1][1] <= P[n-1][0] && P[n-1][1] <= P[n-1][2]){
            min = P[n-1][1];
        }else if(P[n-1][2] <= P[n-1][1] && P[n-1][2] <= P[n-1][0]){
            min = P[n-1][2];
        }

        System.out.println(min);
    }
}
