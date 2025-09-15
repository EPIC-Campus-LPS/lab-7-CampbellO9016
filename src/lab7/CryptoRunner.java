package lab7;

public class CryptoRunner {
	public static void main(String[] args){
		String message = "Hello, how are you?";
		System.out.println(message); // Prints "Hello, how are you?"
		
		String encoded = Crypto.encrypt(message, 7);
		System.out.println(encoded); // Prints "Olssv, ovd hyl fvb?"
		
		String decoded = Crypto.decrypt(encoded, 7);
		System.out.println(decoded); // Prints "Hello, how are you?"
	}

}
