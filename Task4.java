package main4;
import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String x = scanner.nextLine();
		String[] words = x.split(" ");
		
		for (String word : words){
			char y = word.charAt(0);
            char b = word.charAt(word.length() - 1);
			if(isLove(y)) {
				if(noLove(b)) {
					System.out.print(word +" ");
				}
			}
		}
		}
	public static boolean isLove(char c) {
	    c = Character.toLowerCase(c);
	    return c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o' || c == 'y';
	}

   public static boolean noLove(char c) {
       c = Character.toLowerCase(c);
       return !(c == 'a' || c == 'e' || c == 'i' || c == 'u' || c == 'o' || c == 'y');
}
}
