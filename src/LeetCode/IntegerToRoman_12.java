package LeetCode;

public class IntegerToRoman_12 {
	
	public static void main(String[] args) {
		
		int num = 3;
		System.out.println(intToRoman(num));
		
		int num1 = 58;
		System.out.println(intToRoman(num1));
		
		int num2 = 1994;
		System.out.println(intToRoman(num2));
		
		int num3 = 2024;
		System.out.println(intToRoman(num3));
		
		
		
	}
	
	public static  String intToRoman(int num) {
        int[] value = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String[] code = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb = new StringBuilder();

       for(int i = 0; i < value.length ; i++){
           while(num >= value[i]){
               sb.append(code[i]);
               num -= value[i];

           }
       }

       return sb.toString();
        
    }

}
