public class Q283MoveZeroes {
    public void moveZeroes(int[] nums) {
        int pointerOne = 0;
        for(int i = 0; i<nums.length; i++) {
            if(nums[i] == 0){
                break;
            }
            pointerOne++;
        }
        System.out.println(pointerOne);
        int pointerTwo = pointerOne +1;

        while(pointerOne < nums.length && pointerTwo< nums.length) {
            if(nums[pointerTwo] != 0) {

               int temp = nums[pointerOne];
               nums[pointerOne] = nums[pointerTwo];
               nums[pointerTwo] = temp;
               pointerOne++;
           }
           pointerTwo++;
       }
    }
}
