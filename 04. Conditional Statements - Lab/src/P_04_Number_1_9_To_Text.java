import java.util.Scanner;

public class P_04_Number_1_9_To_Text {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        String result = "number too big";

        if(number == 1) {
            result = "one";
        } else if(number == 2) {
            result = "two";
        } else if(number == 3) {
            result = "three";
        } else if(number == 4) {
            result = "four";
        } else if(number == 5) {
            result = "five";
        } else if(number == 6) {
            result = "six";
        } else if(number == 7) {
            result = "seven";
        } else if(number == 8) {
            result = "eight";
        } else if(number == 9) {
            result = "nine";
        }

        System.out.println(result);
    }
}
