package algorithm_1908;

import java.util.Scanner;

public class Q10870 {
    public int pivo(int a){
        if( a == 0 )
            return 0;
        else if ( a == 1 )
            return 1;

        return pivo(a - 1) + pivo(a - 2);
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        Q10870 pivoex = new Q10870();
        System.out.println(pivoex.pivo(s));
    }
}
