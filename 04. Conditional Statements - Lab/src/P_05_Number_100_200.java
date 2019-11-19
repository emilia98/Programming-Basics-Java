import java.util.Scanner;

public class P_05_Number_100_200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());

        String msg = "";

        if(number < 100) {
            msg = "Less than 100";
        } else if(number >= 100 && number <= 200) {
            msg = "Between 100 and 200";
        } else {
            msg = "Greater than 200";
        }

        System.out.println(msg);
    }
}
