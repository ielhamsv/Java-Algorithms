public class Product {
    private String name,brand,color,category;
    private Integer date,price;

    public void setName(String name){
        this.name = name;
    }
    public void setBrand(String _brand){
        brand = _brand;
    }
    public void setColor(String color){
        this.color=color;
    }
    public void setCategory(String category){
        this.category=category;
    }
    public void setDate(Integer date){
        this.date=date;
    }
    public void setPrice(Integer price){
        if(price>=0)
        this.price = price;
    }
    public String getName(){
        return name;
    }
    public String getBrand(){
        return brand;
    }
    public String getColor(){
        return color;
    }
    public String getCategory(){
        return category;
    }
    public Integer getDate(){
        return date;
    }
    public Integer getPrice(){
        return price;
    }
}
