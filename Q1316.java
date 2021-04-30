import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int result = 0;
        System.out.println(repeat);
        String alpa = "abcdefghijklmnopqrstuvwxyz";
        boolean letter_check [] = new boolean[26];
        for (int i = 0; i < repeat; i++){
            String letter = sc.next();
            for (int x = 0; x < letter.length(); x++) { //단어 길이만큼 한 단어씩 반복
                for (int j = 0; j < 26; j++) { //알파벳 수만큼 반복
                    if(letter_check[j] == true){
                        if (letter.charAt(j-1) == alpa.charAt(j)) {// 전 글자와 이번 글자가 같을 경우 result증가.

                        }
                        else if (letter.charAt(j-1) != alpa.charAt(j)){
                            result = result+1;
                        }
                    }
                    else if (letter.charAt(i) == alpa.charAt(j)){ //단어가 등장시 true
                        letter_check[j] = true;
                    }

                }
            }

        }
        System.out.println(repeat-result);
    }
}//아 머리 안굴러가.. ㅋㅋ
