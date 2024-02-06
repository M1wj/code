package HomeWork1;

public class Cxy extends Parent {
    public Cxy() {
    }

    public Cxy(String name, String id, double money, String work) {
        super(name, id, money, work);
    }

    public void show(){
        System.out.println("工号为" + getId() + "的" + getName() + "程序员,拿着" + getMoney() + "的工资,正在" + getWork());
    }
}
