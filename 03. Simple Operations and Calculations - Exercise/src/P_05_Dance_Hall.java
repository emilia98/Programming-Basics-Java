import java.util.Scanner;

public class P_05_Dance_Hall {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double l = Double.parseDouble(sc.nextLine());
        double w = Double.parseDouble(sc.nextLine());
        double a = Double.parseDouble(sc.nextLine());

        double l_cm = l * 100;
        double w_cm = w * 100;

        double hallArea = l_cm * w_cm;
        double wardrobeArea = (a * 100) * (a * 100);
        double benchArea = hallArea / 10;

        double remainingArea = hallArea - (wardrobeArea + benchArea);
        int dancers = (int)Math.floor(remainingArea / 7040);

        System.out.println(dancers);
    }
}
