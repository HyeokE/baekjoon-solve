package src;

import java.util.Scanner;

public class Q4948 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean count [] = new boolean[246913];
        count[0] = true;
        count[1] = true;
        int result = 0;
        for (int i = 2; i < 246913; i++){// 범위지정
            if (count[i] == true){
                continue;
            }
            for (int j = i*i; j < 246913; j+=i){ //2제곱씩 증가
                if(j%i == 0){
                    count[j] = true;
                }
            }
        }
        while (true){
            int N = sc.nextInt();
            if (N == 0){
                break;
            }
            else {
                for (int i = N+1; i <= N*2; i++) {
                    if (count[i] == false) {
                        result++;
                    }
                }
                System.out.println(result);
                result = 0;
            }
        }
    }
}
