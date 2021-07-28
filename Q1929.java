import java.util.Scanner;

public class Q1929 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M =  sc.nextInt();
        int N = sc.nextInt();
        boolean count [] = new boolean[1000001];
        count[0] = true;
        count[1] = true;

        for (int i = 2; i < 1000001/i; i++){// 범위지정
            if (count[i] == true){
                continue;
            }
            for (int j = i*i; j < 1000001; j+=i){
                if(j%i == 0){
                    count[j] = true;
                }
            }
        }
        for (; M <=N; M++){
            if(count[M] == false){
                System.out.println(M);
            }
        }
    }
}
