package LeetCode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class KWeakestRow {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 1, 0, 0, 0},
	            {1, 1, 1, 1, 0},
	            {1, 0, 0, 0, 0},
	            {1, 1, 0, 0, 0},
	            {1, 1, 1, 1, 1}
	        };

	        int kValue = 3;
	        int[] result = findKWeakestRow(matrix, kValue);
	        System.out.println(Arrays.toString(result));


	}
	
	public static int[] findKWeakestRow(int[][] mat, int k) {
		
		int m = mat.length;
		int n = mat[0].length;
		
		Map<Integer, Integer> strengthMap = new HashMap<>();
		
		for(int i = 0; i < m ; i++) {
			int strength = 0;
			for(int j = 0; j <n; j++) {
				strength += mat[i][j];
				
			}
			strengthMap.put(i, strength);
		}
		
		List<Integer> indices = new ArrayList<>(strengthMap.keySet());
		indices.sort((i,j) -> {
			int strOfI = strengthMap.get(i);
			int strOfJ = strengthMap.get(j);
			if(strOfI == strOfJ) 
				return i-j;
			else return strOfI- strOfJ;
		});
		
		int[] result = new int[k];
		for(int i = 0; i < k ; i++) {
			result[i] = indices.get(i);
		}
		
		return result;
		
	}
}
