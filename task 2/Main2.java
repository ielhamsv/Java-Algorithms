
// دریافت دو عدد صحیح و چاپ عدد بزرگتر
import java.util.Scanner;
public class Main2 {
    public static void main(String args[]){
        int x,y;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter nimber 1:");
        x = input.nextInt();
        System.out.println("Enter nimber 2:");
        y = input.nextInt();
        System.out.println(x>y ? x : y );
        input.close();
    }
}
