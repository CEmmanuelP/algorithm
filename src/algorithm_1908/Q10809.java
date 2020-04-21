package algorithm_1908;

import java.util.Scanner;

public class Q10809 {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] array = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
        String words = scan.next();
        String[] wordsarray = words.split("(?<!^)");
        for(int i=0; i<array.length; i++){
            for(int j=0; j<wordsarray.length; j++){
                if(array[i].equals(wordsarray[j])){
                    System.out.print(j + " ");
                    break;
                }
                if(j == (wordsarray.length - 1)){
                    if(array[i].equals(wordsarray[j])){
                        System.out.print(j + " ");
                        break;
                    }else{
                        System.out.print("-1 ");
                    }
                }
            }
        }
    }
}
