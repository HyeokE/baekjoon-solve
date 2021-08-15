package src;

import java.util.Scanner;
//배열 내에 단어 나눠서 넣기. -------------
//안 넣어도 되네...;
// indexOf() : (지정한 문자)가 몇번째에 있는지 변환 없으면 -1(개사기 함수네 ..)
//알파벳 하나씩 for문으로 돌리기?
public class Q10809 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String letter = sc.next();

        int alp[] = new int[26];
        String abc = "abcdefghijklmnopqrstuvwxyz";

        for (int a = 0; a < 26; a++){
            int b = letter.indexOf(abc.charAt(a));
            //abc문자열의 a번째문자가 letter의 문자내의 몇번째에 있는지 b에 넣음.
            alp[a] = b;
            //a가 있으면 몇번째에 있는지 출력함.
        }
        for (int a = 0; a < 26; a++){
            System.out.print(alp[a]+ " ");
        }
    }
}
