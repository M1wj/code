package HomeWork2;

public class Dog extends Parent {

    public void lookHome(){
        System.out.println(getName() + "狗看家");
    }
    public Dog() {
    }

    public Dog(String name, String color, double price) {
        super(name, color, price);
    }
}
