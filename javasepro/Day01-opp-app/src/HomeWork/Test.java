package HomeWork;

public class Test{
    public static void main(String[] args) {
        new B();
    }
}
class A{
    static {
        System.out.println("static-A执行");
    }
    {
        System.out.println("代码块-A执行了");
    }
    public A(){
        System.out.println("构造方法-A执行了");
    }
}

class B extends A{
    static C c=new C();
    static{
        System.out.println("Static-B执行了");
    }
    {
        System.out.println("代码快-b执行了");
    }
    public B(){
        System.out.println("构造方法-b执行了");
    }
}

class C{
    public C(){
        System.out.println("构造方法-C执行了");
    }
}