import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Circle one=new Circle();
        Circle tow=new Circle();
        Circle three=new Circle();
        
        Rect r=new Rect();
        Rect R=new Rect();

        Rect s=new Rect();
        Rect S=new Rect();

        System.out.println("Enter radius 1:");
        one.setRadius(input.nextDouble());
        System.out.println("Enter radius 2:");
        tow.setRadius(input.nextDouble());
        System.out.println("Enter radius 3:");
        three.setRadius(input.nextDouble());

        System.out.println("Circle 1");
        one.display();
        System.out.println("Circle 2");
        tow.display();
        System.out.println("Circle 3");
        three.display();

        System.out.println("Enter sqr width");
        s.setWidth(input.nextInt());
        System.out.println("Enter sqr height");
        s.setHeight(input.nextInt());

        System.out.println("Enter sqr2 width");
        S.setWidth(input.nextInt());
        System.out.println("Enter sqr2 height");
        S.setHeight(input.nextInt());

        System.out.println("Enter rect width");
        r.setWidth(input.nextInt());
        System.out.println("Enter rect height");
        r.setHeight(input.nextInt());

        System.out.println("Enter rect2 width");
        R.setWidth(input.nextInt());
        System.out.println("Enter rect2 height");
        R.setHeight(input.nextInt());

        s.display();
        S.display();
        r.display();
        R.display();

        input.close();
    }
}
