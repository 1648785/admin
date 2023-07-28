public class Demo14 {
    public static void main(String[] args) {
        int[] nums = {1, 3, 500, 7, 9, 50, 40, 60,70};
        int max = nums[0];
        int maxIndex = 0;
        for(int i = 1; i < nums.length; i++) {
            if(max < nums[i]) {
                max = nums[i];
                maxIndex = i;
            }
        }
        System.out.println(nums[maxIndex]);
    }
}