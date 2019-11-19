import java.util.Scanner;

public class P_03_Even_Or_Odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number = Integer.parseInt(sc.nextLine());
        int reminder = number % 2;

        if(reminder == 0) {
            System.out.println("even");
        } else {
            System.out.println("odd");
        }
    }
}
