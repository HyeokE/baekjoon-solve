package src;

import java.util.List;
import java.util.Scanner;

public class Q5622 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String Letter = sc.next();
        String list[] = new String[8];
        list[0] = "ABC";
        list[1] = "DEF";
        list[2] = "GHI";
        list[3] = "JKL";
        list[4] = "MNO";
        list[5] = "PQRS";
        list[6] = "TUV";
        list[7] = "WXYZ";
        int result = 0;
        System.out.println(Letter.length());
        for (int i = 0; i < Letter.length(); i++){ //단어 나누기 예제는 6자리
           String a = String.valueOf(Letter.charAt(i));
           System.out.println("문자열 : " + a);
           for (int y = 0; y < 8; y++) { //다이얼 8칸 전부 비교
               System.out.println("list " + y);
               for(int z = 0; z < list[y].length(); z++){ //list 0~길이까지 비교
                   System.out.println(z);
                   System.out.println(String.valueOf(list[y].charAt(z))+"  "+a);
                   if(a.equals(String.valueOf(list[y].charAt(z)))){
                       result = result + y + 3;
                       System.out.println("result : "+result);
                   }
               }

           }
        }
        System.out.println(result);

    }
}
