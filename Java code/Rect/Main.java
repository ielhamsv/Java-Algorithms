import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        Rect r=new Rect();
        System.out.println("Enter width:");
        r.setX(input.nextDouble());
        System.out.println("Enter height:");
        r.setY(input.nextDouble());

        System.out.println("P: " + r.getP());
        System.out.println("S: " + r.getS());
        System.out.println("Qotr: " + r.getQotr());
        input.close();
    }
}