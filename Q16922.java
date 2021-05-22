import java.util.Scanner;

public class Q16922 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);

        int get_num  = sc.nextInt();

        int num [] = {1,5,10,50};
        boolean check [] = new boolean[1001]; //가장 큰 수가 1000이라 1001까지 생성
        num_check(get_num, num, 0, check);
        System.out.println(result);
        result = 0;
    }
    static int result;
    public static void num_check(int get_num, int list[], int num, boolean[] check){ // 몇개의 숫자, 리스트 가져오기, 1,5,10,50, 0번째시작, check 가져오기
        if (num == get_num){


        }
        for (int i = num; i < list.length; i++){
            num_check(get_num, list, num+1, y+list[i], check);
        }
    }
}
