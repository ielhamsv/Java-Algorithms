// چاپ جدول ضرب یک عدد
import java.util.Scanner;
public class Main4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int x = input.nextInt();
        for(int i=0;i<10;i++){
            System.out.println(x + "*" + i + "=" + (x*i));
        }
        input.close();
    }
}
