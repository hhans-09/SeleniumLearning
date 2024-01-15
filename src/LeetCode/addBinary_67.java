package LeetCode;

/*
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Input: a = "11", b = "1"
 * Output: "100"
 * 
 */

public class addBinary_67 {

	public static void main(String[] args) {
		String a = "11", b = "1";
		String c = "1010", d = "1011";
		
		System.out.println(addBinary(a,b));
		System.out.println(addBinary(c,d));
		System.out.println(addBinary(a,c));
		System.out.println(addBinary(a,d));
		
		

	}
	
	public static String addBinary(String a, String b) {
		
		StringBuilder sb = new StringBuilder();
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0;

        while(i >= 0 || j >=0){
            int sum = carry;
            if(i >=0) sum += a.charAt(i) - '0';
            if(j >=0) sum += b.charAt(j) - '0';
             sb.append(sum % 2);
             carry = sum/2;

             i--;
             j--;
        }

        if(carry!=0) sb.append(carry);
        return sb.reverse().toString();

        
    }

}
