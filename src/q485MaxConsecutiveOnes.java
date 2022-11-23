public class q485MaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxOccurance = 0;
        int currentCount = 0;

        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 1) {
                currentCount++;
                if(currentCount > maxOccurance) {
                    maxOccurance = currentCount;
                }
            } else {
                currentCount = 0;
            }
        }
        return maxOccurance;
    }
}
