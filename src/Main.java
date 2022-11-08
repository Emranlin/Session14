public class Main {


    public static void main(String[] args) {
    Dog dog=new Dog("Lucky",5,"English");
        System.out.println("Name:"+dog.getName());
        System.out.println("Age:"+dog.getAge());
        System.out.println("Breed:"+dog.getBreed());
        System.out.println();

    Cow cow=new Cow("Bartalitta",12,"black");
        System.out.println("Name:"+cow.getName());
        System.out.println("Age:"+cow.getAge());
        System.out.println("Color:"+cow.getColor());
        System.out.println();

        Cat cat=new Cat("Tom",5,12);
        System.out.println("Name:"+cat.getName());
        System.out.println("Age:"+cat.getAge());
        System.out.println("Weight"+cat.getWeight());

    }}