import java.util.Scanner;

public class P_06_Circle_Area_And_Perimeter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double r = Double.parseDouble(sc.nextLine());
        double PI = Math.PI;

        double perimeter = 2 * PI * r;
        double area = PI * r * r;

        System.out.printf("%.2f \n", area);
        System.out.printf("%.2f \n", perimeter);
    }
}
