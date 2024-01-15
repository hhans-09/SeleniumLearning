package LeetCode;
/*
 * Have the function QuestionsMarks(str) take the str string parameter, 
 * which will contain single digit numbers, letters, and question marks, 
 * and check if there are exactly 3 question marks between every pair of two numbers that add up to 10. 
 * If so, then your program should return the string true, otherwise it should return the string false.
 * If there aren't any two numbers that add up to 10 in the string, then your program should return false as well.
 * 
 * For example: 
 * if str is "arrb6???4xxbl5???eee5" then your program should return true 
 * because there are exactly 3 question marks between 6 and 4, 
 * and 3 question marks between 5 and 5 at the end of the string.
 * 
 * 
 */

public class QuestionMark {

	public static void main(String[] args) {
		String input = "aa6?9";
		System.out.println(QuestionsMarks(input));
		
		String input2 = "acc?7??sss?3rr1??????5";
		System.out.println(QuestionsMarks(input2));
		
		

	}
	
	public static String QuestionsMarks(String str) {
	    int firstNum = -1;
	    int secondNum = -1;
	    int questionsmark = 0;

	    for(int i = 0; i < str.length(); i++){
	      char ch = str.charAt(i);

	      if(Character.isDigit(ch)){
	        int num = Character.getNumericValue(ch);
	        if(firstNum == -1){
	          firstNum = num;
	        } else secondNum = num;

	        if(firstNum + secondNum == 10 && questionsmark == 3 ){
	          return "true";
	        } else {
	          firstNum = secondNum;
	          secondNum = num;
	          if(firstNum + secondNum == 10 && questionsmark == 3 ){
	          return "true";
	        }
	        questionsmark = 0;
	        } 

	        
	      } else if(ch == '?'){
	        questionsmark++;
	      }

	    }
	      return "false";
	  }

}
