package src;

public class Q4673 {
    public static int selfnum(int n) {
        int result = n;
        int a = 0;
        String st_n = String.valueOf(n);
        String b [] = new String[st_n.length()];
        //System.out.println(st_n); //검증문
        for (int i = 0; i < st_n.length(); i++) { //숫자를 문자형으로 변경후 길이구함
            b[i] = String.valueOf(st_n.charAt(i)); // 0~끝까지 자름
            //System.out.println(b[i]);  //검증문

            a = a + Integer.parseInt(b[i]);
        }
        result = result + a;
        return result;

    }
    //문자형으로 나눈 것까지는 좋은데 문자열끼리 더해서 문제였네.

    public static void main(String[] args) {

        boolean[] num = new boolean[10001];
        for (int b = 1; b < 10001; b++){
            int as = selfnum(b);
            if(as < 10001){
                num[selfnum(b)] = true;
                //System.out.println(b); //검증문
            }
        }
        for(int b = 1; b < 10001; b++){
            if(num[b] == false){
                System.out.println(b);
            }
        }
    }
}

