package src;

import java.util.Locale;
import java.util.Scanner;

public class Q1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        int max = 0;
        int seq = 0;
        String alpa = "abcdefghijklmnopqrstuvwxyz";
        alpa = alpa.toUpperCase();
        word = word.toUpperCase();
        int alpa_count [] = new int[26];
        char result = '?';

        for (int i = 0; i < word.length(); i++){
            for(int y = 0; y < 26; y++){
                if(word.charAt(i) == alpa.charAt(y)){
                    alpa_count[y] = alpa_count[y]+1;
//                    System.out.println("y: "+y+"alpacount : "+alpa_count[y]) ;
                }
            }
        }
//        for(int i = 0; i < 26; i++) {
//            System.out.println(alpa_count[i]);
//        }
        for (int i = 0; i < 26; i++){
//            System.out.println("-----outof for-----" + i + " st");
            if(alpa_count[i] > max){
//                System.out.println(i);
//                System.out.println("max : " + max);
//                System.out.println("alpacount: "+ alpa_count[i]);
                max = alpa_count[i];
                seq = i;
                result = alpa.charAt(seq);
            }
            else if(alpa_count[i] == max){
                result = '?';
            }
        }
        System.out.println(result);
    }
}
