package main3;
import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String palindrome = scanner.next();
		String resul = "";
		
		for(int i = palindrome.length() -1; i>=0; i--) {
			resul+= palindrome.charAt(i);
			}
		if(resul.equals(palindrome)) {
			System.out.println("YES");
		}else
			System.out.println("NO");
	}

}
