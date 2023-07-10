// محاسبه فاکتوربل عدد
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x= input.nextInt();
        int fact=1;
        for(int i=x;i>=1;i--){
            fact = i*fact;
        }
        System.out.println(fact);
        input.close();
    }
}
