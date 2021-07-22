import java.util.Scanner;

public class Q1978 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Case = sc.nextInt();
        int count = 0;
        int result = 0;
        for (int i = 0; i < Case; i++){
            int num = sc.nextInt();
            if(num > 0){
                for (int j = 1; j <= num; j++){
                    if(num % j == 0){
                        count++;
                    }
                }
                if(count == 2){
                    result++;
                }
                count = 0;
            }
        }
        System.out.println(result);
    }
}
