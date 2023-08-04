public class Demo5 {
    public static void main(String[] args) {
        int arr[][] = new int[8][8];
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        T t = new T();
        t.set(arr);

        System.out.println("===========");
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}

class T {
    public void set(int arr[][], int n, int j) {
        arr[i][j] = 1;
        for(int i = 0; i < 8; i++) {
            arr[0][i] = 2;
            arr[i][0] = 2;
            if(i != 0) {
                arr[0]
            }
        }
    }
}