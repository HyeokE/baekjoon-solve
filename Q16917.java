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
        if (source_chic + default_chic < half_chic * 2) {
            price_result = source_chic*source_num+default_chic*default_num;
        } else {
            if (source_num > default_num) {
                price_result = price_result + source_chic * (source_num - default_num);
                System.out.println(price_result);
                price_result = price_result + ((half_chic * 2) * default_num);
                System.out.println(((half_chic * 2) * default_num));
                System.out.println(price_result);
            } else if (default_num > source_num) {
                price_result = price_result + default_chic * (default_num - source_num);
                System.out.println(price_result);
                price_result = price_result + ((half_chic * 2) * source_num);
                System.out.println(price_result);

            } else if (default_num == source_num) {
                price_result = price_result + source_num * (half_chic * 2) * source_num;
            }

        }
        System.out.println(price_result);
    }

}
