// مجموع اعداد زوج بین 1 تا 50

public class Main3 {
    public static void main(String[] args) {
        int sum =0;
        for(int i=0;i<=50;i++){
            if(i%2==0){
             sum=i+sum;
            }
        }
        System.out.println(sum);
    }
}
