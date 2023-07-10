public class Circle{
    private Double radius;

    public void setRadius(Double radius){
        this.radius=radius;
    }
    public Double getRadius(){
        return radius;
    }

    public Double P(){
        return 2*Math.PI*radius;
    }
    public Double S(){
        return Math.PI*radius*2;
    }

    public void display(){
        double masahat=S();
        double mohit=P();
        System.out.println(">Masahat: " + masahat);
        System.out.println(">Mohit: " + mohit);
    }
}