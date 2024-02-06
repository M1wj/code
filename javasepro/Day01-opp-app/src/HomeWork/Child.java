package HomeWork;

class Parent {
    public Parent() {
        System.out.println("parent");
    }
}
public class Child extends Parent {
    public Child(String s) {
        System.out.println(s);
    }
    public static void main(String[] args) {
        Child child = new Child("child");
    }
}
