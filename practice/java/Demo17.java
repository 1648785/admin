public class Demo17 {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5};
        int nums2[] = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            nums2[i] = nums[i];
        }
        nums2[nums2.length - 1] = 6;
        for(int i = 0; i < nums2.length; i++) {
            System.out.println(nums2[i]);
        }
    }
}