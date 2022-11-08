public class Cow extends Animal{
    private String color;



    public void setColor(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }public Cow(String name,int age,String color){
        super(name, age);
        this.color=color;
    }
}
