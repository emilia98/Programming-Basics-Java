import java.util.Scanner;

public class P_06_Charity_Campaign {
    public static void main(String[] args) {
        final double cakePrice = 45;
        final double wafferPrice = 5.80;
        final double pancakePrice = 3.20;

        Scanner sc = new Scanner(System.in);

        int daysCount = Integer.parseInt(sc.nextLine());
        int confectionersCount = Integer.parseInt(sc.nextLine());
        int cakesCount = Integer.parseInt(sc.nextLine());
        int waffersCount = Integer.parseInt(sc.nextLine());
        int pancakesCount = Integer.parseInt(sc.nextLine());

        double cakesTotalPrice = cakesCount * cakePrice;
        double waffersTotalPrice = waffersCount * wafferPrice;
        double pancakesTotalPrice = pancakesCount * pancakePrice;

        double totalPrice = (confectionersCount * daysCount * (cakesTotalPrice + waffersTotalPrice + pancakesTotalPrice) * 7) / 8;

        System.out.printf("%.2f", totalPrice);
    }
}