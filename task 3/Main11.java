// دنباله فیبوناچی
import java.util.Scanner;
public class Main11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a=0,b=1,c=0;
        System.out.println("Enter the length of fibonancci:");
        int n=input.nextInt();
        if(n>=1){
            System.out.print("1");
        }
        for(int i=1;i<n;i++){
            c=a+b;
            System.out.printf("%d",c);
            a=b;
            b=c;
        }
        input.close();
    }
}
