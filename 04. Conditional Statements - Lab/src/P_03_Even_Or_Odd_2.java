import java.util.Scanner;

public class P_03_Even_Or_Odd_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int reminder = number % 2;

        System.out.println( (reminder == 0 ? "even" : "odd"));
    }
}
