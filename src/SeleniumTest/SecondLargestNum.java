package SeleniumTest;

public class SecondLargestNum {

	public static void main(String[] args) {
		int[] numbers = {10, 5, 8, 20, 15};
		System.out.println(secondLargest(numbers));

	}
	
	public static int secondLargest(int[] arr) {
		
		if(arr == null || arr.length < 2 ) {
			return -1;
		}
		
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;
		
		for(int num : arr) {
			if (num > firstLargest) {
				secondLargest = firstLargest;
				firstLargest = num;
			} else if (num > secondLargest && num < firstLargest) {
				secondLargest = num;
				
			}
		}
		
		return secondLargest;
		
	}

}
