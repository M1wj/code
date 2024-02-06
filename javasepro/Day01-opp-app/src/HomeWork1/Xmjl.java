package HomeWork1;

public class Xmjl extends Parent {
    private double goodMoney;

    public double getGoodMoney() {
        return goodMoney;
    }

    public void setGoodMoney(double goodMoney) {
        this.goodMoney = goodMoney;
    }

    public Xmjl() {
    }

    public Xmjl(String name,String id,double money,String work,double goodMoney){
        super(name,id,money,work);
        this.goodMoney=goodMoney;


    }

    public void show(){
        System.out.println("工号为" + getId() + "的" + getName() + "项目经理,拿着" + getMoney() + "的工资和" + getGoodMoney() + "正在" + getWork());
    }

}
