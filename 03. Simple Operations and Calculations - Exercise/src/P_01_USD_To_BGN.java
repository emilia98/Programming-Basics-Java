import java.util.Scanner;

public class P_01_USD_To_BGN {
    public static void main(String[] args) {
        final double exchangeRate = 1.79549;

        Scanner sc = new Scanner(System.in);
        double dollars = Double.parseDouble(sc.nextLine());
        double bgn = dollars * exchangeRate;

        System.out.printf("%.2f", bgn);
    }
}
