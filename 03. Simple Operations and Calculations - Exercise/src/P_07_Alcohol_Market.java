import java.util.Scanner;

public class P_07_Alcohol_Market {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double whiskeyPrice = Double.parseDouble(sc.nextLine());
        double beerInLiters = Double.parseDouble(sc.nextLine());
        double wineInLiters = Double.parseDouble(sc.nextLine());
        double rakiaInLiters = Double.parseDouble(sc.nextLine());
        double whiskeyInLiters = Double.parseDouble(sc.nextLine());

        double rakiaPrice = whiskeyPrice * 0.5;
        double winePrice = rakiaPrice * 0.6;
        double beerPrice = rakiaPrice * 0.2;

        double whiskeyTotalPrice = whiskeyPrice * whiskeyInLiters;
        double rakiaTotalPrice = rakiaPrice * rakiaInLiters;
        double wineTotalPrice = winePrice * wineInLiters;
        double beerTotalPrice = beerPrice * beerInLiters;

        double totalMoneySpent = whiskeyTotalPrice + rakiaTotalPrice + wineTotalPrice + beerTotalPrice;

        System.out.printf("%.2f", totalMoneySpent);
    }
}