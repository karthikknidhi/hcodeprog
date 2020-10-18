package ArraysStrings;

public class removeAndEditString {
	
	public static String editString(char[] str, int length) {
		int spacecount=0;
		int newlength = 0;
		int i;
		for(i=0; i <length;i++) {
			if(str[i] == ' ') {
				spacecount++;
			}
		}
		newlength = length + spacecount * 2 ;
		
		char[] c1 = new char[newlength];
		
		for(i=length -1; i>= 0; i--) {
			if(str[i] == ' ') {
				c1[newlength - 1] = '0';
				c1[newlength - 2] = '2';
				c1[newlength - 3] = '%';
				newlength = newlength - 3;
			} else {
				c1[newlength - 1] = str[i];
				newlength = newlength - 1;
				
			}
		}
		
		return new String(c1);
	}
	
public static void main(String[] args) {
		
		char[] s = "a p p l e".toCharArray();
		
		System.out.println(editString(s,s.length));

	}

}
