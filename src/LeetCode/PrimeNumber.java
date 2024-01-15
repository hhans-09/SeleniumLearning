package LeetCode;

public class PrimeNumber {

	public static void main(String[] args) {
		System.out.println(isPrimeNum(29)); // true
        System.out.println(isPrimeNum(35)); // false
        System.out.println(isPrimeNum(20)); // false
        System.out.println(isPrimeNum(27)); // false
        System.out.println(isPrimeNum(7)); // true

	}
	
	public static boolean isPrimeNum(int num) {
		
		for(int i = 2; i <= num/2 ; i++ ) {
			if( num % i == 0) {
				return false;
			}
			
		}
		
		return true;
	}

}
