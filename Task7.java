package main4;
import java.util.Scanner;
public class Task7 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ");
        String str = scanner.nextLine();
        scanner.close();

        StringBuilder result = new StringBuilder();
        for (char c : str.toCharArray()) {
            if (Character.isDigit(c)) {
                result.append('_');
            } else if (Character.isUpperCase(c)) {
                result.append(Character.toLowerCase(c));
            } else if (Character.isLowerCase(c)) {
                result.append(Character.toUpperCase(c));
            } else {
                result.append(c);
            }
        }

        System.out.println("Результат: " + result.toString());
    }

}
