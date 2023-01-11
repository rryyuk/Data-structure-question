import java.util.HashMap;
public class Q217ContainsDuplicate {
    public boolean containsDuplicate(int[] nums) {
        HashMap<Integer, Integer> element = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if(element.containsKey(nums[i])) {
                return true;
            } else {
                element.put(nums[i],1);
            }
        }
        return false;
    }
}
