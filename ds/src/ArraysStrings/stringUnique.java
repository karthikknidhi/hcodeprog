package ArraysStrings;

public class stringUnique {
	
	//O(n)
	//O(1)
	
	public static Boolean unique(String word) {
		boolean[] b = new boolean[256];
		
		int length = word.length();
		for(int i = 0 ; i < length; i++) {
			int a = word.charAt(i);
			if(b[a]) {
				return false;
			}
			b[a] = true;
			
		}
		return true;
	}
	
	
	

	public static void main(String[] args) {
		System.out.println(unique("apple"));

	}

}
