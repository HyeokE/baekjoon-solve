import java.util.Scanner;

public class Q2941 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int result = 0;

        for (int i = 0; i < str.length(); i++) {
            char letter = str.charAt(i);

            if (letter == 'c') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    } else if (str.charAt(i + 1) == '-') {
                        i++;
                    }
                }
            }
            else if (letter == 'd') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'z') {
                        if (i < str.length() - 2) {
                            if (str.charAt(i + 2) == '=') {
                                i = i + 2;
                            }
                        }
                    }
                        else if (str.charAt(i + 1) == '-') {
                            i++;
                        }
                    }
                }

            else if (letter == 'l') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            else if (letter == 'n') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == 'j') {
                        i++;
                    }
                }
            }
            else if (letter == 's') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            else if (letter == 'z') {
                if (i < str.length() - 1) {
                    if (str.charAt(i + 1) == '=') {
                        i++;
                    }
                }
            }
            result++;
        }
        System.out.print(result);
    }
}
