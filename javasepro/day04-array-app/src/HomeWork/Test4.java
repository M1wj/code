package HomeWork;

public class Test4 {
    public static void main(String[] args) {
        int []num={100,50,90,60,80,70};
        int max=num[0];
        for (int i = 1; i < num.length; i++) {
            if(max<num[1]){
                max=num[1];
            }
        }
        System.out.println(max);
    }
}
