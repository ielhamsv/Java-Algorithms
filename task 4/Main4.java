// for each چاپ مقادیر ارایه لیست با حلقه 

import java.util.ArrayList;
import java.util.Arrays;

public class Main4{
    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<String>(
            Arrays.asList("apple","banana","cherry","date")
        );
        for(String fruit: list){
            System.out.println(fruit);
        }
    }
}