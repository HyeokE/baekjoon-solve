//0보다 크거나 같고, 99보다 작거나 같은 정수가 주어질 때 다음과 같은 연산을 할 수 있다.
// 먼저 주어진 수가 10보다 작다면 앞에 0을 붙여 두 자리 수로 만들고, 각 자리의 숫자를 더한다.
// 그 다음, 주어진 수의 가장 오른쪽 자리 수와 앞에서 구한 합의 가장 오른쪽 자리 수를 이어 붙이면 새로운 수를 만들 수 있다. 다음 예를 보자.

//26부터 시작한다. 2+6 = 8이다. 새로운 수는 68이다. 6+8 = 14이다. 새로운 수는 84이다. 8+4 = 12이다. 새로운 수는 42이다. 4+2 = 6이다. 새로운 수는 26이다.

//위의 예는 4번만에 원래 수로 돌아올 수 있다. 따라서 26의 사이클의 길이는 4이다.
//N이 주어졌을 때, N의 사이클의 길이를 구하는 프로그램을 작성하시오.

// 입력받는 함수, 각 자리를 나누고 더하는 함수, 10보다 작을 때 뒤에 0을 붙이는 함수(string형으로 변환) 이 전체를 while 로 반복 숫자 일치시 break
// String 저장하는 변수, int 형 변환후 저장하는 변수, String 변수에 변화과정 저장, 정수 길이 저장하는 변수, 각 횟수 세는 변수

import java.util.Scanner;
public class Q1110 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        String num_as_string = sc.next();
//        int first_num = Integer.parseInt(num_as_string); //첫 숫자 저장
//        int num_size;
//        int result = 0;
//        System.out.println("first num : "+first_num);
//
//        while (true) {
//            if (num_size == 1) { //뒤에 0붙이는 함수
//                num_as_string = String.valueOf(get_0(num_as_string));
//                System.out.println("get0 : " + num_as_string);
//                System.out.println("first num : " + first_num);
//                result++;
//            } else {
//                num_as_string = String.valueOf(each_plus(num_as_string));
//                System.out.println("plus : " + num_as_string);
//                System.out.println("first num : " + first_num);
//                result++;
//            }
//            num_size = num_as_string.length();
//            if (first_num == Integer.parseInt(num_as_string)) {
//                System.out.println(result);
//                System.out.println("first num : " + first_num);
//            }
//
//
//
//        }
//    }
//    public static int each_plus(String num){
//        int result = 0;
//        for (int i = 0; i < num.length(); i++) {
//            result = result + Integer.parseInt(String.valueOf(num.charAt(i))); //value of 로 String형 변환 후 int형으로 변환
//        }
//        System.out.println(result);
//        return result;
//    }
//    public static int get_0(String num){
//        int result;
//        result = Integer.parseInt(num + '0');
//        System.out.println(result);
//        return result;
//
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        in.close();

        int result = 0;
        int copy = num;

        while (true) {
            num = ((num % 10) * 10) + (((num / 10) + (num % 10)) % 10);
            result++;

            if (copy == num) {
                break;
            }
        }
        System.out.println(result);
    }
}

