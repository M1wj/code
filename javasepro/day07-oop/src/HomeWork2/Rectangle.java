package HomeWork2;

public class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    public void mianji()
    {
        System.out.println("长位：" + length + "，宽为：" + width + "的矩形的面积为：" + (length * width));
    }public void zhouchang()
    {
        System.out.println("长位：" + length + "，宽为：" + width + "的矩形的周长为：" + (length+width)*2);
    }
}
