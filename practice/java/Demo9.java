public class Demo9 {
    public static void main(String[] args) {
        double money = 100000;
        int i = 0;
        while(true) {
            if(money < 1000) {
                break;
            }
            if(money > 50000) {
                money -= money * 0.05;
            } else {
                money -= 1000;
            }
            i++;
        }
        System.out.println(i);
    }
}