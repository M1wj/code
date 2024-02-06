package com.itheima.HomeWork.exam1;

public class Breeder {

    public void feed1(Animal animals){
        if(animals instanceof Frog)
        {
            animals.drink();
            animals.eat();
            ((Frog) animals).swimming();
        }
        else if(animals instanceof Sheep)
        {
            animals.drink();
            animals.eat();
        }
        else {
            animals.drink();
            animals.eat();
            ((Dog)animals).swimming();
        }

    }
}
