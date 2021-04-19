import java.util.Scanner;

public class Q2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int list[] = new int[9];
        int max = list[0];
        int num = 0;

        for (int i = 0; i < list.length; i++){
            list[i] = sc.nextInt();
            if (max < list[i]) {

                max = list[i];
                num = i+1;
            }
        }

        System.out.println(max);
        System.out.println(num);
    }
}
