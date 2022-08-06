package BasicPrograms;

import java.util.Scanner;

public class Swaping {
	public static void main(String[] args) {
   int d = 0;
		try (Scanner swap = new Scanner(System.in)) {
			System.out.println("enter ");
			int a = swap.nextInt();
			int b = swap.nextInt();
			int c = swap.nextInt();

			a = d;
			b = c;
			c = b;
			d= a;
			System.out.println("swapped number are");
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}

	}

}
