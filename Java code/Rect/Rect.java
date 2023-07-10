public class Rect {
    private Double x,y;

    public void setX(Double x){
        this.x=x;
    }
    public void setY(Double y){
        this.y=y;
    }
    public Double getP(){
        return (x+y)*2;
    }
    public Double getS(){
        return x*y;
    }
    public Double getQotr(){
        return Math.sqrt((x*x)+(y*y));
    }
}
