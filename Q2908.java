import java.util.Scanner;

public class Q2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String num1 = sc.next();
        String num2 = sc.next();
        int a = Integer.parseInt(number(num1));
        int b = Integer.parseInt(number(num2));
        if(a > b){
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

    }
    public static String number(String num){
        char list[] = new char[3];
        String result = "";
        for (int i = 0; i < 3;i++) {
            list[i] = num.charAt(i);
        }
        for (int i = 2; i >= 0;i--) {
            result = result + list[i];
        }
        return result;
    }
}
