import java.util.Scanner;

public class Q1011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Repeat = sc.nextInt();
        for (int i = 0; i < Repeat; i++){
            int Start = sc.nextInt();
            int End = sc.nextInt();
            int Result;
            int Distance = End - Start;
            int Max = (int)Math.sqrt(Distance); //소수점 제거
            if(Max == Math.sqrt(Distance)){
                Result = 2 * Max -1;
            }
            else if(Max * Max < Distance && Max * Max + Max >= Distance){
                Result = Max * 2;
            }
            else{
                Result = Max * 2 + 1;
            }
            System.out.println(Result);
        }
    }
}
