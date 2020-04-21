package algorithm_1908;

import java.util.*;

public class Q2748 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        long[] list = new long[s+1];

        list[0] = 0;
        list[1] = 1;

        for(int i = 2; i<list.length; i++){
            list[i] = list[i - 1] + list[i - 2];
        }

        System.out.println(list[s]);
    }
}
