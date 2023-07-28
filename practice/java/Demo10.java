public class Demo10 {
    public static void main(String[] args) {
        double num = 1;
        double sum = 0;
        for(int i = 1; i<=100; i++) {
            if(i % 2 == 0) {
                sum = sum - 1 / num;
                num++;
            } else {
                sum = sum + 1 / num;
                num++;
            }
        }
        System.out.print(sum);
    }
}