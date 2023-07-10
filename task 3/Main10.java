// اعداد اول بین یک تا صد

public class Main10 {
    public static void main(String[] args) {
        for(int i=1;i<=100;i++){
            if(i%2!=0 && i%3!=0 && i%5!=0 && i%7!=0){
                System.out.println(i);
            }
        }
    }
}
