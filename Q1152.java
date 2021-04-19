import java.util.Scanner;
import java.util.StringTokenizer;

public class Q1152 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        String sentence = sc.nextLine();

        StringTokenizer result = new StringTokenizer(sentence, " ");
        System.out.println(result.countTokens());
//        Scanner sc  = new Scanner(System.in);
//        String sentence = sc.nextLine();
//        String sen_list [];
//        int typ = 0;
//        sen_list = sentence.split(" ");
//        for(int i = 0; i < sen_list.length; i++) {
//            if(sen_list[i] == null){
//                typ++;
//                System.out.println(typ);
//            }
//        }
//        System.out.println(sen_list.length - typ);
    }
}


