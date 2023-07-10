// بررسی مربع کامل بودن عدد
import java.util.Scanner;
public class Main7 {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the number: ");
    int x = input.nextInt();
    System.out.println(Math.sqrt(x)%1==0 ? "perfect square" : "not perfect square");

    input.close();
   } 
}
