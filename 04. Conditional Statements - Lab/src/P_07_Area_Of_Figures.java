import java.util.Scanner;

public class P_07_Area_Of_Figures {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String figureType = sc.nextLine();
        double area = 0.0;

        switch(figureType) {
            case "square" : {
                area = calcSquare(sc);
                break;
            }
            case "rectangle" : {
                area = calcRectangle(sc);
                break;
            }
            case "circle" : {
                area = calcCircle(sc);
                break;
            }
            case "triangle" : {
                area = calcTriangle(sc);
                break;
            }
        }

        System.out.printf("%.3f", area);
    }

    private static double calcSquare(Scanner sc) {
        double a = Double.parseDouble(sc.nextLine());
        return a * a;
    }

    private static double calcRectangle(Scanner sc) {
        double a = Double.parseDouble(sc.nextLine());
        double b = Double.parseDouble(sc.nextLine());
        return a * b;
    }

    private static double calcCircle(Scanner sc) {
        double radius = Double.parseDouble(sc.nextLine());
        return radius * radius * Math.PI;
    }

    private static double calcTriangle(Scanner sc) {
        double a = Double.parseDouble(sc.nextLine());
        double ha = Double.parseDouble(sc.nextLine());
        return a * ha / 2;
    }
}
