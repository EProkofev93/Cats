public class Cat {
    //Поля класса
    double weight;
    String name;
    int age;
    String color;

    //Методы класса
    void meow() {
        System.out.println("Meow");
    }

    void pee() {
        weight -= 20;
    }

    void eat() {
        weight += 50;
    }
    public Cat() {
        this(3000, "Barsik",1, "Grey");
    }
    public Cat(double weight, String name, int age, String color) {

        this.weight = weight;
        this.name = name;
        this.age = age;
        this.color = color;
    }
}