// چاپ عدد
import java.util.Scanner;
public class Main2 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        System.out.println("Your number is " + x);
        input.close();
    }
}
