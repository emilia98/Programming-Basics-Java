import java.util.Scanner;

public class P_06_Password_Guess {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String passwordToGuess = "s3cr3t!P@ssw0rd";
        String password = sc.nextLine();

        if(password.equals(passwordToGuess)) {
            System.out.println("Welcome");
        } else {
            System.out.println("Wrong password!");
        }
    }
}
