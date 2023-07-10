import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        hoghouq h=new hoghouq();
        Scanner input=new Scanner(System.in);
        System.out.println("Enter name:");
        h.setName(input.next());
        System.out.println("enter date:");
        h.setDate(input.next());
        System.out.println("number of pays: ");
        int n=input.nextInt();
        for(int i=0;i<n;i++){
            h.addPay(input.nextLong());
        }
        h.fish();
        input.close();
    }
}
