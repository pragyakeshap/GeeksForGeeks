package geeks.amazon;


//Write a method to replace all spaces in a string with ‘%20’.

public class ReplaceStr {

	public static void main(String[] args) {
		
		char[] updated = replaceChar("norah is a sweetie pie");
		for(int i= 0; i < updated.length; i++) {
			System.out.print(updated[i]);
		}

	}
	
	public static char[] replaceChar(String str) {		
		int len = str.length();
		if(str == null ) {
			return null;
		}else if(len ==1) {
			return str.toCharArray();
		}
		int spcCount = 0;
		char[] ch = str.toCharArray();
		for(int i = 0; i < len; i++) {
			if(ch[i] ==  ' ') {
				spcCount++;
			}
		}
		
		int newLen = len + spcCount*2;
		int curr = newLen;
		char[] newch = new char[newLen];
		
		for(int i = len -1 ; i >= 0 ; i--) {
			if(ch[i] == ' ') {
				newch[curr -1] = '0';
				newch[curr -2] = '2';
				newch[curr -3] = '%';
				curr = curr -3;
			}else {
				newch[curr-1] = ch[i];
				curr--;
			}
		}
		return newch;
		
	}

}


