import java.util.Scanner;

public class P_04_Inches_To_Centimeters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double inches = Double.parseDouble(sc.nextLine());
        double cm = inches * 2.54;

        System.out.println(cm);
    }
}
