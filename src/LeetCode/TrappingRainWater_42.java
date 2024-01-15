package LeetCode;

public class TrappingRainWater_42 {

	public static void main(String[] args) {
		int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
		System.out.println(trap(height));
		
		int[] height1 = {4,2,0,3,2,5};
		System.out.println(trap(height1));
	

	}
	public static int trap(int[] height) {

        int n = height.length;
        if(n<3 ) return 0;

         int res = 0;

        for(int i = 1; i <= n-2; i++){
           
            int lb = height[i];
            for(int j = 0; j < i; j++){
                if(height[j]> lb){
                    lb = height[j];
                }
            }
            int rb = height[i];
            for(int j = i+1; j < n; j++){
                if(height[j] > rb){
                    rb = height[j];
                }
            }

            int wl = Math.min(lb,rb);
            int tw = wl - height[i];

            res += tw;
        }
        return res;
    }

}
