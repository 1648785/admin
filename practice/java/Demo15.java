public class Demo15 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int temp;
        for(int i = 0; i < nums.length / 2; i++) {
            temp = nums[i];
            nums[i] = nums[nums.length - i - 1];
            nums[nums.length - i - 1] = temp;
        }
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}