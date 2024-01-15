package LeetCode;

public class isSubsequence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public boolean isSubsequence(String s, String t) {

        int i = 0;
        int j = 0 ;
        while(j < t.length()){
        	if(s.isEmpty())
            if (s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else j++;
            if(i == s.length()){return true;}
        }

        return false;
        
    }
}
