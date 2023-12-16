package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static String greetsThePlayer() {
        System.out.println("May I have your name?");

        Scanner scanUserName = new Scanner(System.in);
        String userName = scanUserName.next();

        System.out.println("Hello, " + userName + "!");
        return userName;
    }
}
