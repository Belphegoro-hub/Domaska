package main3;

public class Task11 {
	public static void main(String[] args) {
		
		for( int i =1;i<=1000;i++) 
				System.out.println((i % 3==0?"fizz":"") + (i % 5==0?"buzz":"") + (i % 3!= 0 && i % 5!= 0? i:""));
		}
}