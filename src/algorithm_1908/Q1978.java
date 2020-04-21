package algorithm_1908;

import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int count = 0;
        boolean a = false;

        for(int i=0; i<s; i++){
            int m = scan.nextInt();

            for(int j=2; j <= m/2; j++){
                if(m%j == 0){
                    a = true;
                    break;
                }
            }
            if(!a && m>1){
                count++;
            }

        }
        System.out.println(count);
    }


}
