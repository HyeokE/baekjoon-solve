import java.util.Scanner;

public class Q1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int repeat = sc.nextInt();
        int result = 0;
        int ans = 0;
        System.out.println("\n"+"repeat : "+repeat);
        String alpa = "abcdefghijklmnopqrstuvwxyz";
        boolean letter_check [] = new boolean[26];
        for (int i = 0; i < repeat; i++){
            System.out.println(" "+i+" st word scan");
            String letter = sc.next(); //i 번째 문자 scan
            System.out.println(" letter length : "+ letter.length());
            for (int x = 0; x < letter.length(); x++) { //단어 길이만큼 한 단어씩 반복

                System.out.println(" alpa : "+ letter.charAt(x));

                for (int j = 0; j < alpa.length(); j++) { //알파벳 수만큼 반복
                    System.out.println("  alpa "+letter.charAt(x)+" and "+alpa.charAt(j)+" check");

                    if(letter_check[j] == true){

                        if(x-1 == 0 && j >= 0) {

                            if(x-1 < 0) {
                                x = 1;
                                if (letter.charAt(x - 1) != alpa.charAt(j)) {
                                    System.out.println("letter " + letter.charAt(j - 1) + " is duplicated");
                                    result = result + 1;
                                    System.out.println("result: " + result);
                                }
                            }
                            else{
                                if (letter.charAt(x - 1) != alpa.charAt(j)) {
                                    System.out.println("letter " + letter.charAt(j - 1) + " is duplicated");
                                    result = result + 1;
                                    System.out.println("result: " + result);
                                }
                            }
                        }
                        else if(j < 0){
                            if (letter.charAt(x) != alpa.charAt(j)) {
                                System.out.println("letter : "+letter.charAt(j)+ " is duplicated");
                                result = result + 1;
                                System.out.println("result: "+result);

                            }
                        }
                    }

                    else if (letter.charAt(x) == alpa.charAt(j)){ //단어가 등장시 true
                        letter_check[j] = true;
                        System.out.println("  letter "+letter.charAt(x)+" and alpa "+alpa.charAt(j)+" is same");
                        System.out.println("  letter_check " +j+ " is true");
                    }
                }
            }
            if(result > 0) {
                ans = ans+1;
                result = 0;
            }
            System.out.println(ans);
            for(int a = 0; a < alpa.length(); a++) {
                letter_check[a] = false;
            }

        }
        System.out.println(repeat);
        System.out.println(ans);
        System.out.println(repeat - ans);
    }
}
