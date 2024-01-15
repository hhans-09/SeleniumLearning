package LeetCode;

import java.util.Arrays;

public class HIndex_274 {

	public static void main(String[] args) {
		

	}
	
	public int hIndex(int[] citations) {
		
		int low = 0, high = citations.length;
        while(low < high){
            int mid = low + high+1/2;
            int cnt=0;

            for(int i = 0; i < citations.length; i++){
                if(citations[i] >= mid) cnt++;
                if(cnt >= mid) low = mid;
                else high = mid-1;
            }
        }

        return low;
        
    }
	
	public int h_index(int[] citations) {
		int h_index =0;
        int n = citations.length;
        Arrays.sort(citations);

        for(int i = 0; i <n ; i++){
            if(citations[i] >= n-i){
                h_index = Math.max(h_index, n-i);
                break;
            }
        }

        return h_index;
	}


}
