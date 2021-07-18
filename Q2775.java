
import java.util.Scanner;

public class Q2775 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [][] Apartment = new int [15][15];
        for (int i = 0; i < 15; i++){
            Apartment[i][1] = 1;
            Apartment[0][i] = i;
        }
        for (int i = 1; i < 15; i++){
            for (int j = 2; j <15; j++){
                Apartment[i][j] = Apartment[i][j-1]+Apartment[i-1][j];
            }
        }

        int re = sc.nextInt();
        for(int i = 0; i < re; i++){
            int K = sc.nextInt();
            int N = sc.nextInt();
            System.out.println(Apartment[K][N]);
        }
    }
}
