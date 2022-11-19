import java.util.HashMap;

public class Q169MajorityElement {
    public int majorityElement(int[] nums) {

        HashMap<Integer, Integer> elementFrequencyCounter = new HashMap<Integer, Integer>();
        int majorityElement = 0, majorityFrequency = 0;

        for(int i = 0; i< nums.length; i++) {
            boolean keyAvailabe = elementFrequencyCounter.containsKey(nums[i]);

            if(keyAvailabe) {
                int currentFrequency = elementFrequencyCounter.get(nums[i]);
                elementFrequencyCounter.put(nums[i], currentFrequency + 1);
            } else {
                elementFrequencyCounter.put(nums[i], 1);
            }

            if(elementFrequencyCounter.get(nums[i]) > majorityFrequency ) {
                majorityFrequency = elementFrequencyCounter.get(nums[i]);
                majorityElement = nums[i];
            }
        }

        int testingMajorityElement = nums.length/2;
        if(testingMajorityElement < majorityFrequency) {
            return majorityElement;
        } else {
            return -1;
        }

    }
}
