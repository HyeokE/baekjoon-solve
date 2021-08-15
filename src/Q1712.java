package src;//고정지출 A에 판매대수 num만큼 각 제품마다 B의 비용발생
//판매가격은 C로 책정
//C*num이 B*num+A보다 크면 손익분기점
//num * C = A + (num * B)
import java.util.Scanner;

public class Q1712 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        int Break_point; //결과값

        if(C<=B){
            Break_point = -1;
        }
        else{
            Break_point = A/(C-B)+1;
        }

        System.out.println(Break_point);
    }
}
