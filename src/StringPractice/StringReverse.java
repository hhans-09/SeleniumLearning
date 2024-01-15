package StringPractice;

public class StringReverse {

	public static void main(String[] args) {
		
		System.out.println("Reverse of string apple : "+ reversedString("apple") );
		System.out.println("Reverse of string John : "+ reversedString("John") );
		System.out.println("Reverse of string phone : "+ reversedString("phone") );
		System.out.println("Reverse of string 1234567 : "+ reversedString("1234567") );
		

	}

	
	public static String reversedString(String str) {
		
		StringBuilder res = new StringBuilder();
		
		for(int i = str.length()-1; i>=0 ; i--) {
			res.append(str.charAt(i));
		}
		
		return res.toString();
		
		
	}
}
