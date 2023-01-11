import java.util.HashMap;
public class Q1TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] targetPositionArray = new int[2];
        HashMap<Integer, Integer> nextNeededElement = new HashMap<Integer, Integer>();

        for(int i = 0; i < nums.length; i++) {
            nextNeededElement.put(nums[i], i);
        }

        for(int i = 0; i< nums.length;i++) {

            int targetElement = target - nums[i];
            targetPositionArray[0] = i;

            if (nextNeededElement.containsKey(targetElement)) {
                if(i != nextNeededElement.get(targetElement) ) {
                    targetPositionArray[1] = nextNeededElement.get(targetElement);
                    break;
                }

            }
        }

        return targetPositionArray;
    }
}
