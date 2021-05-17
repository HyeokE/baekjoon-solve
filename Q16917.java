import java.util.Scanner;
//양념이 더 많으면 빼고
public class Q16917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source_chic = sc.nextInt();  //양념치킨 가격
        int default_chic = sc.nextInt(); //후라이드 가격
        int half_chic = sc.nextInt(); //반반 가격
        int source_num = sc.nextInt(); //양념개수
        int default_num = sc.nextInt(); //후라이드 개수
        int price_result = 0;
        if ((source_chic + default_chic) <= half_chic * 2) {//반반이랑 양념+후라이드 비교
            price_result += (source_chic * source_num) + (default_chic * default_num);
        } else { //후라이드 + 양념가 더 크면
            if (source_num > default_num) {//양념이 후라이드보다 크면
                price_result += default_num * (half_chic * 2); //반반가격x2x후라이드개수에다가 양념개수에서 후라이드 개수 뺀 가격만큼 더해준다.
                price_result += Math.min((source_num - default_num) * source_chic, (source_num - default_num) * (half_chic * 2));
                //(양념 - 후라이드개수) X (양념가격과 양념 - 후라이드) X 반반치킨 X 2 비교해서 더 작은 값
            } else {
                price_result += source_num * (half_chic * 2);
                price_result += Math.min((default_num - source_num) * default_chic, (default_num - source_num) * (half_chic * 2));
            }

        }
        System.out.println(price_result);
    }

}
