import java.util.Scanner;

public class P_07_Area_Of_Figures_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figureType = sc.nextLine();

        if(figureType.equals("square")) {
            double a = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", a * a);
        } else if (figureType.equals("rectangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double b = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", a * b);
        } else if (figureType.equals("circle")) {
            double radius = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", radius * radius * Math.PI);
        } else if (figureType.equals("triangle")) {
            double a = Double.parseDouble(sc.nextLine());
            double ha = Double.parseDouble(sc.nextLine());
            System.out.printf("%.3f", a * ha / 2);
        }
    }
}
