import java.util.Scanner;

public class P_02_Concatenate_Data_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String lastName = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String town = sc.nextLine();

        System.out.println("You are " + firstName + " " + lastName + ", a " + age+"-years old person from " + town + ".");
    }
}
