public class Demo1 {
    public static void main(String args[]) {
        int ab = 4;
        Demo1 a = new Demo1();

        a.a(ab);
    }

    public void a(int n) {
        if(n > 2) {
            a(n - 1);
        }
        System.out.print(n);
    }
}