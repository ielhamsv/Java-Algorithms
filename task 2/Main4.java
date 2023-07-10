// بررسی زوج و فرد بودن عدد
import java.util.Scanner;
public class Main4 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        System.out.print(x%2==0 ? "even" : "odd");
        input.close();
    }
}
