// بررسی برابر بودن دو عدد
import java.util.Scanner;
public class Main5 {
 public static void main(String args[]){
    Scanner input = new Scanner(System.in);
    System.out.println("Enter number 1 :");
    int x = input.nextInt();
    System.out.println("Enter number 2 :");
    int y = input.nextInt();
    System.out.println(x==y ? "Equal" : "not Equal");
    input.close();
}
}