// ساخت یک ارایه لیست از رشته ها و چاپ مقدار در ایندکس 3

import java.util.ArrayList;
import java.util.Arrays;

public class Main3 {
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(
            Arrays.asList("apple","cherry","banana","date"));
            System.out.println(list.get(3));
    }
}
