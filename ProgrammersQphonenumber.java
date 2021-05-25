//문제 설명
//프로그래머스 모바일은 개인정보 보호를 위해 고지서를 보낼 때 고객들의 전화번호의 일부를 가립니다.
//전화번호가 문자열 phone_number로 주어졌을 때, 전화번호의 뒷 4자리를 제외한 나머지 숫자를 전부 *으로 가린 문자열을 리턴하는 함수, solution을 완성해주세요.
//
//제한 조건
//s는 길이 4 이상, 20이하인 문자열입니다.
//입출력 예
//phone_number	return
//"01033334444"	"*******4444"
//"027778888"	"*****8888"

public class ProgrammersQphonenumber {
    public static void main(String[] args) {
                String answer = "123456789";
                char num [] = new char[4];
                String result = "";
                int leng = answer.length()-4;
                System.out.println(leng);
                System.out.println(answer.length());
                for (int i = answer.length(); i > leng; i--){
                    num[i] = answer.charAt(i);
                    System.out.println(i);
                }
                for (int i = 0; i < leng; i++){
                    result = result+ "*";
                }
                for (int i = 4; i > 0; i--){
                    result = result + num[i];
                    System.out.println(num[i]);
                }
                System.out.println(result);
            }

        }



