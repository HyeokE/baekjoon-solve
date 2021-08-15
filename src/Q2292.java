package src;

import java.util.Scanner;

//고리별로 벌집의 개수가 몇 개인지 세어보기.
//2~7일 때는  6개
//8~19일 때는 12개
//20~37일 때는 18개
//방개수는 6배씩 증가.
public class Q2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int cycle = 1;
        int range = 2;
        if (num == 1){
            System.out.println(1);
        }
        else {
            while(range <= num){
                range = range + (cycle * 6);
                cycle++;
            }
            System.out.println(cycle);
            }

        }

    }

