package HomeWork;

public class Test2 {
    public static void main(String[] args) {
        int a=5;int b=2;int c=1243;
        int max=max(a,b,c);
        System.out.println(max);
    }

    public static int max(int a,int b, int c)
    {
        int t=a>b?a:b;
        int max=t>c?t:c;
        return max;
    }
}
