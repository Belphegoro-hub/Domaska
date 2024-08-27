package main3;

public class Task2 {
	public static void main(String[] args) {
		
		
		int start=2;
		int stop=1000000;
		
		for (int i = start; i <= stop; i++) {
            int del = 0;
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    del++;
                    break;
                }
            }
            if (del == 0) {
                System.out.println(i);
            }
        }
	}
}
