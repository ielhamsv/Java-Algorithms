// یافتن مجموع مضرب های 5 و 3

public class Main12 {
    public static void main(String[] args) {
        int i=2,sum=0;
        while(i<100){
            if(i%3==0 || i%5==0){
                sum=sum+i;
            }
            i++;
        }
        System.out.println(sum);
    }
}
