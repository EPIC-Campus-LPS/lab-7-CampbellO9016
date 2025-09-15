package lab7;

public class Crypto {
	static String[] a = new String[]{"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};

	
	public static String encrypt(String s, int i) {
		s = s.toLowerCase();
		String sub;
		String word = "";
		
		for(int j = 0; j < s.length(); j++) {
			int index = 0;
			sub = s.substring(j, j+1);
			boolean run = false;
			for(int l = 0; l <= a.length - 1; l++) {
				run = false;
				if(sub.equals(" ") || sub.equals(",") || sub.equals("?")) {
					break;
					
				}
				else if(a[l].equals(sub)) {
					index = l;
					run = true;
					break;
					}					
			}
			if(run)
				index += i;

			if(index >= 26) {
				int d = index - 26;
				index = d;
			}
			if(j == 0) {
				word += a[index];
				word = word.toUpperCase();
			}
			
			else if(run)
				word += a[index];
			else
				word += sub;

			
		}
		return word;
		
	}
	public static String decrypt(String s, int i) {
		s = s.toLowerCase();
		String sub;
		String word = "";
		
		for(int j = 0; j < s.length(); j++) {
			int index = 0;
			sub = s.substring(j, j+1);
			boolean run = false;
			for(int l = 0; l <= a.length - 1; l++) {
				run = false;
				if(sub.equals(" ") || sub.equals(",") || sub.equals("?")) {
					break;
					
				}
				else if(a[l].equals(sub)) {
					index = l;
					run = true;
					break;
					}					
			}
			if(run)
				index -= i;

			if(index < 0) {
				int d = index + 26;
				index = d;
			}
			if(j == 0) {
				word += a[index];
				word = word.toUpperCase();
			}
			else if(run)
				word += a[index];
			else
				word += sub;

			
		}
		return word;
		
	}
	
}

