public class Demo19 {
    public static void main(String[] args) {
        int temp = 0;
        int arr[] = {66, 85, 41, 53, 20, 407, 502, 44,9999};
        for(int j = 0; j < arr.length - 1; j++){
            for(int i = 0; i < arr.length - j - 1; i++) {
                if(i != arr.length - 1) {
                    if(arr[i] > arr[i + 1]) {
                        temp = arr[i];
                        arr[i] = arr[i + 1];
                        arr[i + 1] = temp;
                    }
                }
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
    }
}