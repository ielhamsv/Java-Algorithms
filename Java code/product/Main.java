import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Product one = new Product();
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Product name:");
        one.setName(input.next());

        System.out.println("Enter Product brand:");
        one.setBrand(input.next());

        System.out.println("Enter Product color:");
        one.setColor(input.next());

        System.out.println("Enter Product category:");
        one.setCategory(input.next());

        System.out.println("Enter Product date:");
        one.setDate(input.nextInt());

        System.out.println("Enter Product price:");
        one.setPrice(input.nextInt());

        System.out.println("---------------------------------------------------------------");
        System.out.println("Product details:");

        System.out.println("> Product Name: " + one.getName());
        System.out.println("> Product Brand: " + one.getBrand());
        System.out.println("> Product Color: " + one.getColor());
        System.out.println("> Product Category: " + one.getCategory());
        System.out.println("> Product Date: " + one.getDate());
        System.out.println("> Product Price: " + one.getPrice());
        input.close();
    }
}