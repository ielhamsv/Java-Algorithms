// محاسبه مجموع عناصر لیست

import java.util.ArrayList;
import java.util.Scanner;

public class Main7 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<Integer>();
        System.out.println("Enter arraylist items:");
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        list.add(input.nextInt());
        System.out.println("Your list is:");
        System.out.println(list);
        int sum=0;
        for(int i=0;i<4;i++){
            sum=sum+list.get(i);
        }
        System.out.println("sum: " + sum);
        input.close();
    }
}
