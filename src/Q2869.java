package src;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Q2869 {
    public static void main(String[] args) throws IOException {
//        Scanner sc = new Scanner(System.in);
//        int A = sc.nextInt();
//        int B = sc.nextInt();
//        int V = sc.nextInt();
//        int num = (V-B)/(A-B);
//        if((V-B)%(A-B) != 0){
//            num++;
//        }
//        System.out.println(num);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());
        int num = (V-B)/(A-B);

        if((V-B)%(A-B) != 0){
            num++;
        }
        System.out.println(num);
    }

}

