import java.util.Scanner;

public class P_02_Radians_To_Degrees {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double radians = Double.parseDouble(sc.nextLine());
        double degrees = (radians * 180) / Math.PI;

        System.out.printf("%.0f", degrees);
    }
}