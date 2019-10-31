import java.util.Scanner;

public class P_09_Fish_Tank {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double length = Double.parseDouble(sc.nextLine());
        double width = Double.parseDouble(sc.nextLine());
        double height = Double.parseDouble(sc.nextLine());
        double percentage = Double.parseDouble(sc.nextLine());

        // 0.1 * 0.1 * 0.1 = 0.001
        double aquariumVolumeInDm = length * width * height * 0.001;
        double litersNeededToFill = aquariumVolumeInDm;
        double litersNeeded = litersNeededToFill * (1 - (percentage / 100));

        System.out.printf("%.3f", litersNeeded);
    }
}
