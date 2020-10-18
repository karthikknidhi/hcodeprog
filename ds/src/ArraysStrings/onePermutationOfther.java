package ArraysStrings;

public class onePermutationOfther {
	
	
	public static Boolean checkPermutation(String s, String t) {
		
		if(!(s instanceof String) || !(t instanceof String)) {
			return false;
		}
		
		if(s.length() != t.length()) return false;
		
		int[] charset = new int[256];
		
		char[] s_array = s.toCharArray();
		
		for(char c : s_array) {
			charset[c]++;
		}
		
		for(int i=0;i<t.length();i++) {
			int c = (int) t.charAt(i);
			if(--charset[c] < 0) {
				return false;
			}
		}
		
		return true;
	}

	public static void main(String[] args) {
		
		System.out.println(checkPermutation("god","dog"));

	}

}
