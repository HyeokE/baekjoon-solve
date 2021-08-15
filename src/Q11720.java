package src;

import java.util.Scanner;

public class Q11720 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = num.nextInt();
        int result = 0;

        String b = num.next();

        for (int i = 0; i < a; i++){

            result = result + b.charAt(i);
        }
        System.out.println(result);
//        String a = "1234";
//        System.out.println(a.charAt(0)-'0');

    }
}
