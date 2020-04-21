package algorithm_1908;

import java.util.*;

public class Q1932 {
    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int max = 0;
        int d[][] = new int[n+1][n+1];

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                d[i][j] = scan.nextInt();
                if(j == 1){
                    d[i][j] = d[i-1][j] + d[i][j];
                }else if(j == i){
                    d[i][j] = d[i-1][j-1] + d[i][j];
                }else{
                    d[i][j] = Math.max(d[i-1][j-1], d[i-1][j]) + d[i][j]  ;
                }
                if(max < d[i][j]){
                    max = d[i][j];
                }
            }
        }
        System.out.println(max);
        scan.close();
    }
}
