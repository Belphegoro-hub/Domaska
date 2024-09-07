package main4;
import java.util.Scanner;

public class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		String list = "";
		String z = "";
		int check = 0;
		list = scanner.next();
		z = scanner.next();
		
		for(int i = 0; i < list.length(); i++) {
		    if(String.valueOf(list.charAt(i)).equals(z)) {
		    	check++;
		    }	
	}
		 if(check == 0) {
		    	System.out.print("Совпадений: ");
		 }
		System.out.print(check);
}
}