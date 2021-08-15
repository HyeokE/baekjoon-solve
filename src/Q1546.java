package src;

import java.util.Scanner;

public class Q1546 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int many = num.nextInt();
        double list[] = new double[many];
        double max = 0;
        double result = 0;
        for (int a = 0; a < many; a++){
            list[a] = num.nextInt();
            if(max < list[a]){
                max = list[a];
            }
        }
        for (int b = 0; b < many; b++){
                list[b] = list[b] / max*100;
        }
        for(int c = 0; c < many; c++){
            result = list[c]+result;
        }

        System.out.println(result/many);

    }
}
