import java.util.Scanner;
//양념이 더 많으면 빼고
public class Q16917 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int source_chic = sc.nextInt();
        int default_chic = sc.nextInt();
        int half_chic = sc.nextInt();
        int source_num = sc.nextInt();
        int default_num = sc.nextInt();
        int price_result = 0;
        int half_num = 0;
        if (source_num > default_num){
            price_result = price_result + source_num * (source_num - default_num);
            price_result = price_result + default_num*(half_chic*2);
        }
        else if (default_num > source_num){
            price_result = price_result + source_num * (default_num - source_num);
            price_result = price_result + source_num*(half_chic*2);

        }
        else if(default_num == source_num){
            price_result = price_result + source_num*(half_chic*2);
        }
    }
}
