// بررسی عدد بودن یا نبودن کاراکتر
import java.util.Scanner;
public class Main8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char c = input.next().charAt(0);
        System.out.println(Character.isDigit(c) ? "Digit" : "not Digit");
        input.close();
    }
}
