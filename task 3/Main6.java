// شماردن تعداد ارقام یک عدد صحیح
import java.util.Scanner;
public class Main6{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int count = 0;
        int x = input.nextInt();
        while(x>0){
            x=x/10;
            count++;
        }
        System.out.println(count);
        input.close();
    }
}