import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Hoghoogh h=new Hoghoogh();

        System.out.println("Enter name");
        h.setName(input.next());
        System.out.println("Enter date");
        h.setDate(input.next());
        System.out.println("Enter number pays");
        int n=input.nextInt();
        for (int i=0;i<n;i++){
            h.addPays(input.nextLong());
        }
        h.print();
        input.close();
    }
}
