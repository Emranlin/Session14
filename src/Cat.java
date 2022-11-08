public class Cat extends Animal{
    private int weight;



    public void setWeight(int weight) {
        this.weight = weight;}

        public int getWeight() {
            return weight;
        }


public Cat (String name,int age,int weight){
        super(name, age);
        this.weight=weight;
    }
}
