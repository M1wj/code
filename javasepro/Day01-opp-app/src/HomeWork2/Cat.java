package HomeWork2;

public class Cat extends Parent {

    public void catchHouse(){
        System.out.println(getName() + "猫抓老鼠");
    }
    public Cat() {
    }

    public Cat(String name, String color, double price) {
        super(name, color, price);
    }
}
