import java.util.Scanner;

public class P_08_Yard_Greening {
    public static void main(String[] args) {
        final double priceForSquareMeter = 7.61;

        Scanner sc = new Scanner(System.in);
        double squareMetersForGardening = Double.parseDouble(sc.nextLine());

        double totalSum = squareMetersForGardening * priceForSquareMeter;
        double discount = totalSum * 0.18;
        double priceWithDiscount = totalSum - discount;

        System.out.printf("The final price is: %.2f lv. \n", priceWithDiscount);
        System.out.printf("The discount is: %.2f lv.", discount);
    }
}
