public class Rect {
    private Integer width,height;

    public void setWidth(Integer width){
        this.width=width;
    }
    public int getWidth(){
        return width;
    }
    public void setHeight(Integer height){
        this.height=height;
    }
    public int getHeight(){
        return height;
    }    
    public Integer Mohit(){
        return (width+height)*2;
    }
    public Integer Masahat(){
        return width*height;
    }
    public void display(){
        if(width==height){
            System.out.println("rect");
        }else{
            System.out.println("sqr");
        }
        int p = Mohit();
        int s= Masahat();
        System.out.println("mohit= " + p);
        System.out.println("masahat= " + s);
    }
}
