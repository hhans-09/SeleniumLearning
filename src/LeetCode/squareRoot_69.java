package LeetCode;
/*
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. 
 * The returned integer should be non-negative as well.
 * 
 * Input: x = 4
 * Output: 2
 * 
 * Input: x = 8
 * Output: 2
 * 
 */
public class squareRoot_69 {

	public static void main(String[] args) {
		int x = 2147395599;
		System.out.println(mySqrt(x));

	}
	
	public static int mySqrt(int x) {

        int left = 1;
        int right = x;
        int res = 0;

        while(left < right){
            int mid = left + (right-left) /2;
           
          if(mid <= x/mid) {
        	  left = mid +1;
        	  res = mid;
          } else {
        	  right = mid -1;
          }
        }
        
        return res;
        
    }

}
