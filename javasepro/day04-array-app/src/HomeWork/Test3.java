package HomeWork;

public class Test3 {
    public static void main(String[] args) {
        int []num={100,50,90,60,80,70};
        int min=num[0];
        for (int i = 1; i < num.length; i++) {
            if(min>num[1]){
                min=num[1];
            }
        }
        System.out.println(min);
    }
}
