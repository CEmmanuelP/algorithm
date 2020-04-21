package algorithm_1908;

import java.util.Scanner;

public class Q11053 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] list = new int[n+1];
        int[] d = new int[n+1];
        d[1] = 1;

        for(int i=1; i<=n; i++){
            list[i] = scan.nextInt();
        }

        for(int i=2; i<=n; i++){
            d[i] = 1;
            for(int j=1; j<=i; j++){
                if(list[i] > list[j] && d[i] <= d[j]){
                    d[i] = d[j] + 1;
                }else if(list[i] == list[j]){
                    d[i] = d[j];
                }
            }
        }

        int max = 0;
        for(int i=1; i<=n; i++){
            max = Math.max(d[i], max);
        }

        System.out.println(max);

        scan.close();
    }
}
