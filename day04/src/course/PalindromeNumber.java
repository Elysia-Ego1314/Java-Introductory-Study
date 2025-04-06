package course;


import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number1 = sc.nextInt();
		int number2 = number1;
		int palindrome = 0;
		while (number1 != 0) {
			palindrome = palindrome * 10 + number1 % 10;
			number1 /= 10;
		}
		System.out.println(palindrome == number2);
	}
}
