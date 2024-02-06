package HomeWork1;

public class Parent {
    private String name;
    private String id;
    private double money;
    private String work;

    public Parent() {
    }

    public Parent(String name, String id, double money, String work) {
        this.name = name;
        this.id = id;
        this.money = money;
        this.work = work;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }
}
