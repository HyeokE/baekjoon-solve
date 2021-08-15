package src;

import java.util.Scanner;

public class Q2839 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int result;
        int x = 0;
        sc.close();
        while (true) {
            if (N % 5 == 0) {
                result = N / 5;
                System.out.println(result+ x);
                break;
            }
            else if(N <= 0){
                System.out.println(-1);
                break;
            }
            N = N -3;
            x++;
        }
    }
}
