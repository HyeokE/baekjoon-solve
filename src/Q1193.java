package src;

import java.util.Scanner;

public class Q1193 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int line = 1;
        int count = 0;
        String result;
        while(true){
            if (x <= line+count){
                if(line%2 == 1){
                    result = ((line - (x - count - 1))+ "/" + (x-count)); //분자 분모
                    break;
                }
                else{
                    result = ((x - count) + "/" + (line - (x - count - 1))); //분자 분모
                    break;
                }
            }
            else{
                count = count + line;
                line++;
            }
        }
        System.out.println(result);
    }
}
