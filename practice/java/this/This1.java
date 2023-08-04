public class This1 {
    public static void main(String[] args) {
        T t = new T();
        System.out.println(t.m(1,2,3));
        
    }
}

class T {
    int a = 1;
    public T() {
        this.a = 5;
        System.out.println(this.hashCode());
    }
    public int m(int... a) {
        return a.length;
    }
}