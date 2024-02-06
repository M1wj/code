package HomeWork3;

public class GirlFriend {
    private String name;
    private double sg;
    private double tz;

    public void wash()
    {
        System.out.println(name + "给我洗衣服");
    }public void cook()
    {
        System.out.println(name + "给我做饭");
    }public void show()
    {
        System.out.println("我女朋友叫"+name +"，身高"+sg+"厘米，体重"+tz+"斤");
    }
    public GirlFriend() {
    }

    public GirlFriend(String name, double sg, double tz) {
        this.name = name;
        this.sg = sg;
        this.tz = tz;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSg() {
        return sg;
    }

    public void setSg(double sg) {
        this.sg = sg;
    }

    public double getTz() {
        return tz;
    }

    public void setTz(double tz) {
        this.tz = tz;
    }
}
