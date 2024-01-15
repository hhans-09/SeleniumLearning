package LeetCode;

public class RotateArrayfromNthElelment {

	public static void main(String[] args) {
		int[] arr = {2,3,4,1,6,10};
		
		System.out.println(rotateArray(arr));
		int[] arr1 = {3,2,1,6};
		System.out.println(rotateArray(arr1));
		int[] arr2 = {4,3,4,3,1,2};
		System.out.println(rotateArray(arr2));
		
		System.out.println("***************");
		System.out.println(rotateArray2(arr));
		System.out.println(rotateArray2(arr1));
		System.out.println(rotateArray2(arr2));
		
	}
	
	public static String rotateArray(int[] arr) {
		if(arr == null ) return null;
		int n = arr[0];
		
		int[] rotated = new int[arr.length];
		
		System.arraycopy(arr, n, rotated, 0, arr.length-n);
		System.arraycopy(arr, 0, rotated, arr.length-n, n);
		
		StringBuilder sb = new StringBuilder();
		for(int num : rotated) {
			sb.append(num);		
			}
		return sb.toString();
	}
	
	public static String rotateArray2(int[] arr) {
		if(arr == null ) return null;
		int n = arr[0];
		
		int[] rotated = new int[arr.length];
		
		for(int i = n; i < arr.length; i++) {
			rotated[i-n] = arr[i];
		}
		
		for(int i = 0; i < n; i++) {
			rotated[arr.length-n+i] = arr[i];
		}
		
		
		StringBuilder sb = new StringBuilder();
		for(int num : rotated) {
			sb.append(num);		
			}
		return sb.toString();
	}


}
