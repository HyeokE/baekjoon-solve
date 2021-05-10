//상도시의 차량 번호판 형식이 주어졌을 때, 가능한 차량 번호판의 개수를 구해보자.
//
//번호판에 사용할 수 있는 숫자는 0, 1, 2, ..., 8, 9이다.
//사용할 수 있는 문자는 a, b, c, d, ..., y, z이다.
//차량 번호판의 형식은 최대 4글자이고, c와 d로 이루어진 문자열로 나타낼 수 있다.
//c는 문자가 위치하는 자리, d는 숫자가 위치하는 자리이다.
//같은 문자 또는 숫자가 연속해서 2번 나타나면 안 된다.
//예를 들어, 형식이 "cd"이면, a1, d4, h5, k4 등이 가능하다. 형식이 "dd"인 경우에 01, 10, 34, 69는 가능하지만, 00, 11, 55, 66은 같은 숫자가 2번 연속해서 불가능하다.
import java.util.Scanner;

public class Q16968 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char word_list [] = sc.next().toCharArray();
        int result = 1;
        for (int i = 0; i < word_list.length; i++){
            if (i == 0){ //첫번째 단어일 경우
                if (word_list[i] == 'c'){
                    result = result*26;
                }
                else{
                    result = result*10;
                }
            }
            else{ //이후 word check
                if(word_list [i] == word_list[i-1]){
                    if (word_list[i] == 'c'){
                        result = result*25;
                    }
                    else{
                        result = result*9;
                    }

                }
                else{
                    if (word_list[i] == 'c'){
                        result = result*26;
                    }
                    else{
                        result = result*10;
                    }
                }
            }
        }
        System.out.println(result);

    }
}
