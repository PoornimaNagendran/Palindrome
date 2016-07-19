package Guvi;
import java.util.*;
public class Palindrome {

	public static void main(String[] args) {
		int s = 0;
		@SuppressWarnings("resource")
		Scanner ww = new Scanner(System.in);
		System.out.println("enter a number");
		int q = ww.nextInt();
		while (q != 0) {
			s += (q % 10);
			q = q / 10;
		}
		System.out.println("The sum of digits is "+s);
		int ss = s;
		int dumy = 0;

		while (s != 0) {
			dumy = dumy * 10;
			dumy = dumy + (s % 10);
			s = s / 10;

		}
		if (dumy == ss) {
			System.out.println("the sum of number is palindrome");
		} else {
			System.out.println("the sum is not palindrome");
		}

	}

}
