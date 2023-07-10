import java.util.ArrayList;
import java.util.Arrays;

public class Main5 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<Integer>(
            Arrays.asList(3,6,2,4)
        );
        for(int num:list){
            System.out.println(num);
        }
    }
}
