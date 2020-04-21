package algorithm_1908;

import java.util.*;

public class Q1003 {
    public static int fib(int n){
        int a = 1;
        int b = 0;
        int c = 1;

        if(n == 0){
            return 1;
        }else if(n == 1){
            return 0;
        }else{
            for(int i=1; i<=n; i++) {
                a = b;
                b = c;
                c = a + b;
            }
            return a;
        }
    }

    public static void main(String[] args) throws Exception{
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        String result;

        for(int i=0; i<t; i++){
            int n = scan.nextInt();
            result = fib(n) + " " + fib(n+1);
            System.out.println(result);
        }
    }


}
