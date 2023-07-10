// چاپ مربع عدد
import java.util.Scanner;
public class Main5 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        System.out.println(Math.pow(x,2));
        input.close();
    }
}
