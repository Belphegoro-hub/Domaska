package main3;

public class Task1 {
	public static void main(String[] args) {
		int sum1=0;
		int sum2=1;
		int sum3=0;
		
		System.out.println(sum1 + "" + sum2);
		
		for(int i =3; sum3<=10000000;i++) {
			sum3=sum1+sum2;
			
			System.out.println(sum3);
			
			sum1=sum2;
			sum2=sum3;
		}
}
}
