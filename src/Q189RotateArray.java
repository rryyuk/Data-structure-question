public class Q189RotateArray {
//    public int[] rotate(int[] nums, int k) {
//        int n = nums.length;
//        for(int i = 0; i < k; i++) {
//            int temp = nums[0];
//            for(int j = 0; j < n -1; j++) {
//                nums[j] = nums[j+1];
//            }
//            nums[n-1] = temp;
//        }
//          return nums;
//    }

    public int[] rotate(int[] nums, int k) {
        k %= nums.length;
        reverse(nums, 0,nums.length-1);
        reverse(nums,0,k-1);
        reverse(nums,k, nums.length-1);
        return nums;
    }

    public void reverse(int[] nums, int start, int end) {
        while(start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

}
