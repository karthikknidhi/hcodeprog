package ArraysStrings;

public class reverseNullTerminatedString {
	
	public static String reverse(String str) {
	    char[] chars = str.toCharArray();
	    int n = chars.length;
	    for (int i = 0; i < n/2; i++) {
	        char tmp = chars[i];
	        chars[i] = chars[n-i-1];
	        chars[n-i-1] = tmp;
	    }
	    return new String(chars);
	}
	
	//second method using built in functions
	
	public String reverse2(String str) {
	    return new StringBuilder(str).reverse().toString();
	}
	
	
	public static void main(String[] args) {
		
		String s = "apple";
		
		System.out.println(reverse(s));
	}

}