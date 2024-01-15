package SeleniumTest;

/*
 * At a lemonade stand, each lemonade costs $5.
 * Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
 * Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill. 
 * You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
 * Return true if and only if you can provide every customer with correct change.
 * 
 */

public class LemonadeChange {

	public static void main(String[] args) {
		int[] bills = {5, 5, 10, 10, 20};
		boolean result = lemonadeChange(bills);
		System.out.println(result);

	}
	
	public static boolean lemonadeChange(int[] arr) {
		
		
		int fives = 0;
		int tens = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 5) {
				fives++;
			} else if(arr[i] == 10){
				fives --;
				tens++;
				
			} else if ( arr[i] ==20 && tens > 0) {
				tens--;
				fives--;
			} else {
				fives -= 3;
			}
			System.out.println(fives);
			
			if(fives < 0) {
				return false;
			}
			
		}
			return true;
		
	}

}
