// دریافت ورودی کارکتر و بررسی صدادار بودن ان

import java.util.Scanner;
public class Main3 {
    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the character:");
        char c = input.next().charAt(0);
        char list[] = {'e','i','u','o','a','E','U','I','O','A'};
        for(int i=0;i<10; i++){
            if(c==list[i]){
                System.out.println("vowel");
                break;
            }
            else if(c!=list[i] && i==9){
                System.out.println("not vowel");
                break;
            }

        }
        
        input.close();
    }
}
