package SeleniumTest;

public class RecursivelycheckforA {

	public static void main(String[] args) {
		System.out.println(checkForA("Hello, World!"));
		System.out.println(checkForA("abcd"));
		System.out.println(checkForA("DBCA"));
		System.out.println(checkForA(""));
		
	}
	
	public static boolean checkForA(String str) {
		if(str == null || str.length() == 0) {
			return false;
		}
		
		return (Character.toLowerCase(str.charAt(0)) == 'a') || 
				checkForA(str.substring(1));
	}

}
