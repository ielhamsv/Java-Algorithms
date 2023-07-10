import java.util.ArrayList;

public class Hoghoogh{
    private String name,date;
    private ArrayList<Long> pays;
    Hoghoogh(){
        pays=new ArrayList<>();
    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public void setDate(String date){
        this.date=date;
    }
    public String getDate(){
        return date;
    }

    public void addPays(long p){
        pays.add(p);
    }

    public long Jamemabalegh(){
        long sum=0;
        for(int i=0;i<pays.size();i++){
            sum=sum+pays.get(i);
        }
        return sum;
    }

    public long bime(long sum){
        return (long) (sum*0.07);
    }
    public long maliat(long sum){
        return (long) (sum*0.04);
    }
    
    public long khales(long sum,long kasr){
        return sum - kasr;
    }

    public void print(){
        System.out.println("Fish Hoghooghi");
        System.out.println("NAme: " + getName());
        System.out.println("Date" + getDate());
         for(int i=0;i<pays.size();i++){
            System.out.println(pays.get(i));
         }
         Long sum=Jamemabalegh();
         System.out.println("jame " + sum);
         System.out.println();
         System.out.println("bime " + bime(sum));
         System.out.println("maliat " + maliat(sum));
         long kasr=maliat(sum)+bime(sum);
         System.out.println("kasri: " + kasr);
         System.out.println("khales: " + khales(sum,kasr));
    }
}