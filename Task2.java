package main4;
import java.util.Scanner;

public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите команду (Создать)");
		String choice = scanner.next();
		System.out.println("Число?");
		String number = scanner.next();
		
		switch (choice) {
        case "Создать":
            String list = refund();
            toFind(list,number);
        	break;
    }
	}
	public static String refund() {
		StringBuilder list = new StringBuilder();
		for(int i=1;i<=1000;i++) {
			list.append(i).append("");
	}
		return list.toString();
}
	public static void toFind(String list,String position) {
		int index = list.indexOf(position);
		if(index != -1) {
			index++;
			System.out.println("Индекс: "+index );
			System.out.println(list);
		}
	}
}