public class Q2149RearrangeArrayElementBySign {
    public int[] rearrangeArray(int[] nums) {
        int[] arrangedArray = new int[nums.length];
        int positiveCounter = 0;
        int negativeCounter = 1;

        for(int i = 0; i<nums.length; i++){
            if(nums[i] > 0){
                arrangedArray[positiveCounter] = nums[i];
                positiveCounter += 2 ;
            } else {
                arrangedArray[negativeCounter] = nums[i];
                negativeCounter += 2;
            }
        }
        return arrangedArray;
    }
}
