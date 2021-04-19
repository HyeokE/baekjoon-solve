import java.util.Scanner;

public class Q8958 {
    public static void main(String[] args) {

        Scanner num = new Scanner(System.in);
        int i  = num.nextInt();

        for (int a  = 0; a < i; a++){
            int plus_score = 1;
            int final_score = 0;
            String score = num.next();
            char list[] = new char[80];

            for (int b = 0; b < score.length(); b++){
                list[b] = score.charAt(b);
            }
            for (int b = 0; b < score.length(); b++){

                if(list[b] == 'O'){

                    final_score = final_score+plus_score;
                    plus_score++;
                }
                if(list[b] == 'X'){

                    plus_score = 1;
                }
            }
            System.out.println(final_score);
        }


    }
}

