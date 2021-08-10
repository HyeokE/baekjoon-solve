import java.util.Scanner;

public class Q9020 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        boolean count[] = new boolean[1000001];
        count[0] = true;
        count[1] = true;

        int result = 0;

        for (int i = 2; i < 1000001; i++){// 범위지정
            if (count[i] == true){
                continue;
            }
            for (int j = i*i; j < 1000001; j+=i){
                if(j % i == 0){
                    count[j] = true;
                }
            }
        }
        for (int i = 0; i < T; i++){
            int N = sc.nextInt();
            for (int j = 0; j < count.length; j++){
                if(count[j] == false){
                    if (N > j) {
                        result = N - j;
                        System.out.println("N : " +N+" - "+j+" = "+ result);
                        System.out.println(count.length);

                        for (int k = count.length; k >= 0; k--){
                            System.out.println("k : "+ k);

                            if(count[k] == false) {
                                System.out.println(k);

                                if (result == k) {
                                    System.out.print(result);
                                    System.out.println(k);
                                }
                            }
                            result = 0;
                        }
                    }
                }
            }
        }
    }
}

