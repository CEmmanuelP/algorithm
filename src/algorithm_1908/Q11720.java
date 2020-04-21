package algorithm_1908;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        String cal = scan.next();
        int sum = 0;

        if(num == 1){
            System.out.println(cal);
        }else{
            char[] ch = cal.toCharArray();
            for(int i=0; i<ch.length; i++){
                sum += Character.getNumericValue(ch[i]);
            }
            System.out.println(sum);
        }
    }

}
