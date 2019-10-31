import java.util.Scanner;

public class P_01_Greeting_By_Name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.printf("Hello, %s!", name);
    }
}
