

package LeetCode;

/*
 * You are climbing a staircase. It takes n steps to reach the top.
 * Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
 * 
 * Example: 
 * Input: n = 2
 * Output: 2
 * 
 * Input: n = 3
 * Output: 3
 * 
 */

public class climbingStairs_70 {
	
	public static void main(String[] args) {
		int n = 8;
		System.out.println(climbStairs(n));
		
	}
	
	  public static int climbStairs(int n) {

	        if (n==1) return 1;
	        int[] steps = new int[n+1];
	        steps[1] = 1;
	        steps[2] = 2;

	        for(int i = 3; i <=n; i++){
	            steps[i] = steps[i-1] + steps[i-2];
	        }

	        return steps[n];

	        
	    }

}
