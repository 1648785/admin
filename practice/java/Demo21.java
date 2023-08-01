public class Demo21 {
    public static void main(String[] args) {
        int nums[] = {10, 20, 30, 40, 80, 100};
        int num = 3;
        int index = -1;
        int newNums[] = new int[nums.length + 1];
        for(int i = 0; i < nums.length; i++) {
            if(num < nums[i]){
                index = i;
                break;
            }
        }
        for(int i = 0; i < newNums.length; i++) {
            if(i < index) {
                newNums[i] = nums[i];
            } else if(i == index) {
                newNums[i] = num;
            } else {
                newNums[i] = nums[i - 1];
            }
        }
        nums = newNums;
        for(int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}