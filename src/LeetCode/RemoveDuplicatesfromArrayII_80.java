package LeetCode;

public class RemoveDuplicatesfromArrayII_80 {

	public static void main(String[] args) {
		int[] nums = {1,1,1,2,2,3};
		System.out.println(removeDuplicates(nums));
		int[] nums2 = {0,0,1,1,1,1,2,3,3};
		System.out.println(removeDuplicates(nums2));
		int[] nums3 = {0,0,1};
		System.out.println(removeDuplicates(nums3));

	}

	public static int removeDuplicates(int[] nums) {
        if(nums.length < 3) return nums.length;
        int idx = 2;
        for(int i = 2; i < nums.length; i++){
            if(nums[i] != nums[idx-2]){
                nums[idx] = nums[i];
                idx++;
            }
        }
        return idx;
    }
}
