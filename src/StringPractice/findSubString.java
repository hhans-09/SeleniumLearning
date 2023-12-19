package StringPractice;

public class findSubString {

	public static void main(String[] args) {
		System.out.println(isSubstring("heena hans learning","hans"));
		System.out.println(isSubstring("heena hans learning","Hans"));
		System.out.println(isSubstring("heena hans learning","heena"));
		System.out.println(isSubstring("heena hans learning","testing"));
		System.out.println(isSubstring("heena hans learning $$ amount","$$"));
		System.out.println(isSubstring("heena","ee"));
		System.out.println(isSubstring("automation","auto"));
		System.out.println(isSubstring("heena hans learning","l"));
		System.out.println(isSubstring("heena hans learning11","11"));
		System.out.println(isSubstring("heena hans learning22","2"));
		System.out.println(isSubstring("automation",null));
		System.out.println(isSubstring("heena hans learning"," "));
		System.out.println(isSubstring("heena hans learning","  "));

		System.out.println(isSubstring1("heena hans learning","hans"));
		System.out.println(isSubstring1("heena hans learning","testing"));
		
		System.out.println(isSubstring2("heena hans learning","hans"));
		System.out.println(isSubstring2("heena hans learning","testing"));
		
		System.out.println(isSubstringcaseIgnore("heena hans learning","hans"));
		System.out.println(isSubstringcaseIgnore("heena hans learning","testing"));
		System.out.println(isSubstringcaseIgnore("heena hans learning","Hans"));

	}

	// Using Reg Expression 
		public static boolean isSubstring(String main, String sub) {
			return main.matches("(.*)"+ sub + "(.*)");
		}
		
		// String contains 
		public static boolean isSubstring1(String main, String sub) {
			return main.contains(sub);
		}
		
		// String indexof 
		public static boolean isSubstring2(String main, String sub) {
			return main.indexOf(sub)!=-1;
		}
		
		public static boolean isSubstringcaseIgnore(String main, String sub) {
			return main.toUpperCase().contains(sub.toUpperCase());
		}
}
