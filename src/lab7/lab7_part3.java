package lab7;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class lab7_part3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String line = "";
		int place = 0;
		String fn;
		String st = "";
		int r;
		File file = new File("emails.txt");
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			line = scan.nextLine();
			place = line.indexOf("@");
			
			fn = line.substring(0, place);
			fn += ", ";
			
			for(int i = 0; i < 10; i ++) {
				r = (int)(Math.random() * 94 + 33);
				st += String.valueOf((char)(r));
				
				
			}
			System.out.println(fn + st);
			st = "";
		}
	}

}
