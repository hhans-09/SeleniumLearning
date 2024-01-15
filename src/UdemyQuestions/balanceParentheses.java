package UdemyQuestions;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Assert;

public class balanceParentheses {

	public static void main(String[] args) {

		String actualText = "Sometimes ((I (am) too much (confused (when))) there are multiple parentheses in a sentence)";

		testParenthesesBalance(actualText);

	}

	public static void testParenthesesBalance(String actualText) {
		int countLeftPare = 0;
		int countRightPare = 0;

		String LeftPareEx = "(\\()";
		String RightPareEx = "(\\))";
		
		try {

			// left Parentheses
			countLeftPare = getPatternMatch(actualText, LeftPareEx);
			System.out.println("Countof left parentheses: "+ countLeftPare);
			
			// Right Parentheses
			countRightPare = getPatternMatch(actualText, RightPareEx);
			System.out.println("Countof right parentheses: "+ countRightPare);

			Assert.assertEquals(countLeftPare, countRightPare);
			System.out.println("Test case passed");
		} catch (AssertionError e) {
			System.out.println("Test case failed");
			Assert.fail();

		}

	}
	
	public static int getPatternMatch(String actualText, String regEx) {
		
		int para = 0;
		Pattern pattern = Pattern.compile(regEx);
		Matcher matcher = pattern.matcher(actualText);

		while (matcher.find()) {

			System.out.println("Matched group " + matcher.group());
			para++;
		}
		
		return para;
		
		
	}

}
