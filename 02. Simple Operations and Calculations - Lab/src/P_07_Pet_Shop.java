import java.util.Scanner;

public class P_07_Pet_Shop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dogsCount = Integer.parseInt(sc.nextLine());
        int otherAnimalsCount = Integer.parseInt(sc.nextLine());

        double totalSum = dogsCount * 2.50 + otherAnimalsCount * 4;

        System.out.printf("%.2f lv.", totalSum);
    }
}
