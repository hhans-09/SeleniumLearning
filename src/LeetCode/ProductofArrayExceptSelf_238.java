package LeetCode;

import java.util.Arrays;

public class ProductofArrayExceptSelf_238 {

	public static void main(String[] args) {
		int[] nums = {1,2,3,4};
		
		int[] result = productExceptSelf(nums);
		
		System.out.println(Arrays.toString(result));
		
		int[] resultB = productExceptSelfBrute(nums);
		
		System.out.println(Arrays.toString(resultB));
		
		System.out.println(Arrays.toString(productExceptSelfDivide(nums)));

	}
	
	public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] pre = new int[n];
        int[] suff = new int[n];

        pre[0] = 1;
        suff[n-1] = 1;

        for(int i = 1; i < n; i++){
            pre[i] = pre[i-1]*nums[i-1];
        }

        for(int i = n-2;i >=0; i-- ){
            suff[i] = suff[i+1]*nums[i+1];
        }

        int[] ans = new int[n];
        for(int i = 0; i <n; i++){
            ans[i] = pre[i]*suff[i];
        }

        return ans;
    }
	
	public static int[] productExceptSelfBrute(int[] nums) {
		
		int n = nums.length;
		
		
		int[] ans = new int[n];
		for(int i = 0 ; i < n; i++) {
			int prod = 1;
			for(int j = 0; j<n; j++) {
				if(i == j ) continue;
				prod *= nums[j];
			}
			ans[i] = prod;
			
		}
		
		return ans;
	}
	
	public static int[] productExceptSelfDivide(int[] nums) {
		
		int n = nums.length;
		int prod = 1;
		
		int[] ans = new int[n];
		
		for(int i = 0 ; i < n; i++) {
			prod *= nums[i];
		}
		
		for(int i = 0; i <n; i++) {
			ans[i] = prod/nums[i];
		}
		
		return ans;
	}

}
