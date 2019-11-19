import java.util.Scanner;

public class P_08_Toy_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double puzzlePrice = 2.60;
        double dollPrice = 3.00;
        double teddyBearPrice = 4.10;
        double minionPrice = 8.20;
        double truckPrice = 2.00;

        double tripPrice = Double.parseDouble(sc.nextLine());
        int puzzlesCount = Integer.parseInt(sc.nextLine());
        int dollsCount = Integer.parseInt(sc.nextLine());
        int teddyBearsCount = Integer.parseInt(sc.nextLine());
        int minionsCount = Integer.parseInt(sc.nextLine());
        int trucksCount = Integer.parseInt(sc.nextLine());

        int totalToys = puzzlesCount + dollsCount + teddyBearsCount + minionsCount + trucksCount;

        double totalPrice =
                (puzzlePrice * puzzlesCount) + (dollPrice * dollsCount) + (teddyBearPrice * teddyBearsCount) +
                        (minionPrice * minionsCount) + (truckPrice * trucksCount);

        if(totalToys >= 50) {
            totalPrice *= 0.75;
        }

        totalPrice *= 0.90;

        double moneyDiff = totalPrice - tripPrice;

        if(moneyDiff >= 0) {
            System.out.printf("Yes! %.2f lv left.", moneyDiff);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", Math.abs(moneyDiff));
        }
    }
}
