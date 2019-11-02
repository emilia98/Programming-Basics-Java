import java.util.Scanner;

public class P_03_2D_Rectangle_Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double x1 = Double.parseDouble(sc.nextLine());
        double y1 = Double.parseDouble(sc.nextLine());
        double x2 = Double.parseDouble(sc.nextLine());
        double y2 = Double.parseDouble(sc.nextLine());

        double height = Math.abs(x1 - x2);
        double width = Math.abs(y1 - y2);

        double area = height * width;
        double perimeter = 2 * (height + width);

        System.out.printf("%.2f%n", area);
        System.out.printf("%.2f", perimeter);
    }
}