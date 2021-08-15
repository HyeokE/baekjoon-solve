package src;

import java.util.Scanner;

public class Q11653 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        if (N == 1){

        }
        else{
            while (true){
                int a = 1;
                for (int i = 2; i <= N; i++){
                    if (N % i == 0){
                       System.out.println(i);
                       // System.out.println( N);
                        N = N/i;
                        break;
                    }
                }
                if (N == 1){
                    break;
                }
            }
        }
    }
}
