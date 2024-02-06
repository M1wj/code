package HomeWork;

public class Test5 {
    public static void main(String[] args) {
        int []num={100,50,90,60,80,70};
        int max=num[0];
        for (int i = 1; i < num.length; i++) {
            if(max<num[1]){
                max=num[1];
            }
        }
        int min=num[0];
        for (int i = 1; i < num.length; i++) {
            if(min>num[1]){
                min=num[1];
            }
        }
        int sum=0;
        for (int i = 0; i < num.length; i++) {
            sum+=num[i];
        }
        sum=sum-max-min;
        int array=sum/(num.length-2);
        System.out.println(array);
    }
}
