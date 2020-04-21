package algorithm_1908;

import java.util.Scanner;

public class Q15658 {
    static int n;
    static int[] arr, operator;

    static int resultMax, resultMin;

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("입력 숫자 수");
        n = scan.nextInt();
        arr = new int[n];
        operator = new int[4];
        for(int i=0; i<n; i++)
            arr[i] = scan.nextInt();
        for(int i=0; i<4; i++)
            operator[i] = scan.nextInt();

        // Clear Max, Min value
        resultMax = Integer.MIN_VALUE;
        resultMin = Integer.MAX_VALUE;
        solve(1, arr[0]);
        System.out.println(resultMax);
        System.out.println(resultMin);
    }

    private static void solve(int idx, int sum){
        if(idx >= n){
            resultMax = Math.max(resultMax, sum);
            resultMin = Math.min(resultMin, sum);
            return;
        }

        for(int i=0; i<4; i++){
            if(operator[i] == 0) continue;
            operator[i]--;
            switch (i){
                case 0:
                    solve(idx+1, sum+arr[idx]);
                    break;
                case 1:
                    solve(idx+1, sum-arr[idx]);
                    break;
                case 2:
                    solve(idx+1, sum*arr[idx]);
                    break;
                case 3:
                    solve(idx+1, sum/arr[idx]);
                    break;
            }
            operator[i]++;
        }
    }
}
