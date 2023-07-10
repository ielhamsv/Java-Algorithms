// دریافت دو عدد و محاسبه جمع تفریق ضرب تقسیم
import java.util.Scanner;
public class Main9 {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Enter number 1: ");
       int x = input.nextInt(); 
       System.out.println("Enter number 2: ");
       int y = input.nextInt();
       System.out.println(x  + "+" + y + "=" + (x+y));
       System.out.println(x  + "-" + y + "=" + (x-y));
       System.out.println(x  + "*" + y + "=" + (x*y));
       System.out.println(x  + "/" + y + "=" + (x/y));
       input.close();
    }
}
