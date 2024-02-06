package HomeWork2;

public class Test {
    public static void main(String[] args) {
        Rectangle a=new Rectangle(6,8);
        a.mianji();
        a.zhouchang();

        Rectangle b=new Rectangle();
        b.setLength(6);
        b.setWidth(8);
        b.mianji();
        b.zhouchang();

    }
}
