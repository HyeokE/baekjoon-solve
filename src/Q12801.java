package src;

import java.util.Scanner;

public class Q12801 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int pointx [] = new int[N];
        int pointy [] = new int[N];

        for (int a = 0; a < N; a++){
            pointx[a] = sc.nextInt();
            pointy[a] = sc.nextInt();
        }
        int M  = sc.nextInt();
        int islandx [] = new int[M];
        int islandy [] = new int[M];
        for (int b = 0; b < M; b++){
            islandx[b] = sc.nextInt();
            islandy[b] = sc.nextInt();
        }
        int x = ((islandy[1]- islandy[0])/(islandx[1] - islandy[1]));
        int y = ((islandy[1]- islandy[0])/(islandx[1] - islandy[1]))*1-islandx[0]-islandy[0];



    }
}
