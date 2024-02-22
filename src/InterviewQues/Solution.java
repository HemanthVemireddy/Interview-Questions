package InterviewQues;

public class Solution {
    public static int removeDuplicates(int[] nums) {
        int i = 0;

        for(int k = 0; k < nums.length; k++) {
            if(i == 0 || i == 1 || nums[i-2] != nums[k]) {
                nums[i] = nums[k];
                i = i + 1;
            }
        }
        return i;
    }
    public static void main(String[] args)
    {
        int [] values ={1,1,1,2,2,2,2,9,9,9,9,8,8,8};
        removeDuplicates(values);
    }
}

