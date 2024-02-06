package HomeWork;

public class Test1 {
    public static void main(String[] args) {
        //方法两个数中的最小值并返回
        double a=3;double b=4;
        double min=min(a,b);
        System.out.println(min);
    }
    public static double min(double a,double b)
    {
        double min=0;
        min=a<b?a:b;
        return min;
    }
}
