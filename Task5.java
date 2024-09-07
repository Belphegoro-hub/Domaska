package main4;
import java.util.Scanner;
public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        String[] words = input.split("\\s+");

        for (String word : words) {
            int count = countLetters(word);
            if (count % 2 == 0) {
                System.out.println(word + ": четное (" + count + ")");
            } else {
                System.out.println(word + ": нечетное (" + count + ")");
            }
        }
    }

    public static int countLetters(String word) {
        int count = 0;
        for (char c : word.toCharArray()) {
            if (Character.isLetter(c)) {
                count++;
            }
        }
        return count;
	}

}
