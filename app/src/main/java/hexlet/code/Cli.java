package hexlet.code;
import java.util.Scanner;
public class Cli {
    public static void greetsThePlayer() {
        System.out.println("May I have your name?");
        Scanner sc = new Scanner(System.in);
        String userName = sc.next();
        sc.close();
        System.out.println("Hello, " + userName + "!");
    }
}
