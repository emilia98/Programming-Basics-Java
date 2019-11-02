import java.util.Scanner;

public class P_04_Tailoring_Workshop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tablesCount = Integer.parseInt(sc.nextLine());
        double lengthOfTable = Double.parseDouble(sc.nextLine());
        double widthOfTable = Double.parseDouble(sc.nextLine());

        double lengthTablecloth = lengthOfTable + (2 * 0.30);
        double widthTablecloth = widthOfTable + (2 * 0.30);
        double tableclothArea = (lengthTablecloth) * (widthTablecloth);

        double sideChecked = lengthOfTable / 2;
        double checkedArea = sideChecked * sideChecked;

        double priceOfTablecloth = tableclothArea * 7;
        double priceOfChecked = checkedArea * 9;

        double totalPriceInUSD = tablesCount * (priceOfTablecloth + priceOfChecked);
        double totalPriceInBGN = totalPriceInUSD * 1.85;

        System.out.printf("%.2f USD%n", totalPriceInUSD);
        System.out.printf("%.2f BGN", totalPriceInBGN);
    }
}
