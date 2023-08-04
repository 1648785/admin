public class Demo2 {
    public static void main(String[] args) {
        digui digui = new digui();
        int a = digui.getNum(1);
        System.out.print(a);
    }
}
class digui {
    public int getNum(int n) {
        if(n == 1 || n == 2) {
            return 1;
        } else {
            return getNum(n - 1) + getNum(n - 2);
        }
    }
}
// 1 1 2 3 5 8 13 21