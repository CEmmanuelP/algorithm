package algorithm_1908;

import java.util.Arrays;
import java.util.Scanner;

public class Q1908 {
    public static void main(String[] args){
        String S, P = "";
        char[] arr = {};
        int cnt;

        Scanner scan = new Scanner(System.in);

        cnt = scan.nextInt();
        S = scan.next();
        char[] sep =S.toCharArray();

        for(int i=0; i<sep.length; i++){
            for(int j=0; j<cnt; j++){
                P += Character.toString(sep[i]);
            }
        }

        System.out.println(P);

    }
}
