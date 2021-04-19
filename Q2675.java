import java.util.Scanner;

public class Q2675 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();

        for (int i = 0; i < repeat; i++) {
            int R = sc.nextInt();
            String S = sc.next();
            String P = "";

            for (int a = 0; a < S.length();  a++) {
                for (int b = 0; b < R; b++) {
                    P = P + S.charAt(a);
                }

            }
            System.out.println(P);

        }
    }
}
