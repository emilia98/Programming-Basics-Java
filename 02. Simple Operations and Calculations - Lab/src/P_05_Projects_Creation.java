import java.util.Scanner;

public class P_05_Projects_Creation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        int projectsCount = Integer.parseInt(sc.nextLine());
        int hoursNeeded = projectsCount * 3;

        System.out.printf("The architect %s will need %d hours to complete %d project/s.", name, hoursNeeded, projectsCount);
    }
}
