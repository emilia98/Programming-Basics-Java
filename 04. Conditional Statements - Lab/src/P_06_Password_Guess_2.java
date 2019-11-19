import java.util.Scanner;

public class P_06_Password_Guess_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String password = sc.nextLine();
        System.out.println("s3cr3t!P@ssw0rd".equals(password) ? "Welcome" : "Wrong password!");
    }
}
