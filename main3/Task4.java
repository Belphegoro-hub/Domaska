package main3;

public class Task4 {
	public static void main(String[] args) {
		
		int start = 0;
		int stop = 1000000;
		
		for(int i = start; i<=stop;i++) {
			int perfect = 0;
			for(int j=1; j<i;j++) {
				if(i % j == 0) {
					perfect +=j;
				}
			}	
			if(perfect == i && i!=0) {
				System.out.println(perfect);
			}
			}
		}
}

