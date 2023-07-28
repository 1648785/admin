public class Demo16 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int nums2[] = new int[nums.length];
        for(int i = nums.length - 1, j = 0; i >= 0 ; i--, j++) {
            nums2[j] = nums[i];
        }
        nums = nums2;
        for(int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
        }
    }
}