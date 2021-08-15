package src;//import java.util.Scanner;
//
//public class Q4344 {
//    public static void main(String[]args){
//        Scanner i = new Scanner(System.in);
//        int repeat = i.nextInt();
//        for(int a = 0; a < repeat; a++){
//            int num = 0;
//            num = i.nextInt();
//            int student_total = 0;
//            double student_average = 0;
//            int list[] = new int[num];
//            double result;
//            double over_av = 0;
//
//            for (int b = 0; b < num; b++){
//
//                list[b] = i.nextInt();
//                student_total = list[b] + student_total;
//                System.out.println("score sum : "+ student_total);
//                System.out.println(list[b]);
//            }
//
//            student_average = student_total/num;
//            System.out.println("student average : " + student_average);
//
//            for (int c = 0; c < num; c++){
//                if(list[c] > student_average){
//                    over_av++;
//                    System.out.println("people: "+over_av);
//
//                }
//            }
//            result = over_av/(double)num*100;
//            System.out.println("num : "+num);
//            System.out.println("people rate : "+result);
//            System.out.println(String.format("%.3f",result)+"%");
//
//        }
//    }
//}
import java.util.Scanner;

public class Q4344 {
    public static void main(String[]args){
        Scanner i = new Scanner(System.in);

        int repeat = i.nextInt();

        for(int a = 0; a < repeat; a++){

            int num = i.nextInt();
            int student_total = 0;
            double student_average = 0;
            int list[] = new int[num];
            double result;
            double over_av = 0;

            for (int b = 0; b < num; b++){

                list[b] = i.nextInt();
                student_total = list[b] + student_total;

            }

            student_average = student_total/num;


            for (int c = 0; c < num; c++){
                if(list[c] > student_average){
                    over_av++;

                }
            }
            result = over_av/(double)num*100;
            System.out.println(String.format("%.3f",result)+"%");

        }
    }
}