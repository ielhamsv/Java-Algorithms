import java.util.ArrayList;

public class hoghouq{
    // فیلد ها
    private String name;
    private String date;
    private ArrayList<Long> pays;
    hoghouq(){
        pays = new ArrayList<>();
    }
    // متد ها
    // متد های set , get
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setDate(String date){
        this.date= date;
    }
    public String getDate(){
        return date;
    }
    // متد افزودن مبلغ پرداختی جدید
    public void addPay(long p){
        pays.add(p);
    }
    // متد محاسبه جمع مبالغ پرداختی
    public long Jamhoghouq(){
        long sum=0;
        for(int i =0;i<pays.size();i++){
            sum=sum+pays.get(i);
        }
        return sum;
    }
    // محاسبه بیمه
    public long bime(long sum){
        return (long) (sum*0.07);
    }
    public long maliat(long sum){
        return (long) (sum*0.04);
    }
    public long khales(long sum,long kasr){
        return sum - kasr;
    }
    
    public void fish(){
        long sum=Jamhoghouq();
        long b = bime(sum);
        long m = maliat(sum);
        long kasr= b+m;
        long kh=khales(sum, kasr);

        System.out.println(name);
        System.out.println(date);
        System.out.println();
        for(int i=0;i<pays.size();i++){
            System.out.println(pays.get(i));
        }
        System.out.println(sum);
        System.out.println(b);
        System.out.println(m);
        System.out.println(kasr);
        System.out.println(kh);
    }
}