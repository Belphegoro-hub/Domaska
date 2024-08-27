package main3;
import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int kilometers = 10; 
		int days = 0; 
		int needed_kilometers; 

		System.out.print("Сколько км должен пробежать спортсмен? ");
		needed_kilometers = scanner.nextInt();

		while (kilometers < needed_kilometers) {
			kilometers += kilometers * 0.1; 
			days++; 
		}
		System.out.print( days +" Дней нужно чтоб пробежать: "+ needed_kilometers + " км");
	}
}
