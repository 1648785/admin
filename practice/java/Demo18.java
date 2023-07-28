import java.util.Scanner;
public class Demo18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int nums[] = {1,2,3,4,5};
        while(true) {
            int nums2[] = new int[nums.length + 1];
            for(int i = 0; i < nums.length; i++) {
                nums2[i] = nums[i];
            }
            System.out.println("num");
            nums2[nums2.length - 1] = input.nextInt();
            for(int i = 0; i < nums2.length; i++) {
                System.out.println(nums2[i]);
            }
            System.out.println("continue?");
            if(input.next().charAt(0) == 'n') {
                break;
            }
        }
    }
}