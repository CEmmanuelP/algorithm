package algorithm_1908;

import java.util.*;

public class Q1904 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        long[] list= new long[s+1];
        list[0] = 0;
        list[1] = 1;
        list[2] = 2;

        for(int i=3; i<=s; i++){
            list[i] = list[i-1] + list[i-2];
            list[i]%=15746;
        }

        System.out.println(list[s]);


    }
}
