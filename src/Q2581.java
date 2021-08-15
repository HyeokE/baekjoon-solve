package src;

import java.util.Scanner;

public class Q2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int N = sc.nextInt();

        int count = 0;
        int result = 0;
        int PrimeNum [] = new int [N];
        int a = 0;

        for (int j = M; j <= N; j++) { //범위 내의 소수 구하기
            for (int i = 1; i <= j; i++) {
                if (j % i == 0) {
                    count++;
                }
            }
            if (count == 2){//소수판정, 배열에 추가
                PrimeNum[a] = j;
                a++;
            }
            count = 0; //공약수 초기화
        }
        for (int i = 0; i < PrimeNum.length; i++) {
            result = result+ PrimeNum[i];
        }
        if (PrimeNum[0] == 0){
            System.out.println(-1);
        }
        else{
            System.out.println(result);
            System.out.println(PrimeNum[0]);
        }
    }
}





