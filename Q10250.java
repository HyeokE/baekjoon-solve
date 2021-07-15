

import java.util.Scanner;

public class Q10250 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int Num = sc.nextInt();
        for (int i = 0; i < Num; i ++) {

            int Height = sc.nextInt();
            int RoomCount = sc.nextInt();
            int People = sc.nextInt();

            int RoomResult;
            int RoomHeight = People % Height;
            int RoomNum = People / Height;

            if (RoomHeight == 0){
                RoomResult = (Height*100) + RoomNum;
                System.out.println(RoomResult);

            }

            else {
                RoomResult = (RoomHeight*100) + (RoomNum+1);
                System.out.println(RoomResult);

            }

        }
    }
}
