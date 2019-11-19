import java.util.Scanner;

public class P_02_Greater_Number_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());

        System.out.println((a > b ? a : b));
    }
}
