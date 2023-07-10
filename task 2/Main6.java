// بررسی حروف بزرگ و کوچک
import java.util.Scanner;
public class Main6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Character:");
        char c = input.next().charAt(0);
        System.out.println(Character.isUpperCase(c) ? "UpperCase" : "LowerCase");

        input.close();
    }
}
