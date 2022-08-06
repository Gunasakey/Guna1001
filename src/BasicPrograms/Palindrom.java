package BasicPrograms;

import java.util.Iterator;

public class Palindrom {

	public static void main(String[] args) {
		String original = "Welcome",reverse  = "null";
				
		
		int orginallength = original.length();
		for (int i = orginallength-1; i >= 0; --i) {

           char charAt = original.charAt(i);
			System.out.print(charAt);

		}
	}

}
