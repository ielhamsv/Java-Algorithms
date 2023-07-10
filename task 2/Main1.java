// دریافت عدد صحیح و بررسی مثبت منفی یا صفر بودن آن
import java.util.Scanner;
public class Main1{
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        if(x>0){
            System.out.println("Positive");
        }
        else if(x<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
        input.close();
    }
}