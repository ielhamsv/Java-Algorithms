// معکوس کردن یک عدد
import java.util.Scanner;
public class Main7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = input.nextInt();
        int result=0;
        for(int i=n;i>0;i=i/10){
            int x=i%10;
            result=x+(result*10);
        }
        System.out.println(result);
        input.close();
    }
}
