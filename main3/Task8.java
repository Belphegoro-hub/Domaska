package main3;

public class Task8 {
	public static void main(String[] args) {
		 int count = 0;
	        for (int hour = 0; hour < 24; hour++) {
	            for (int minute = 0; minute < 60; minute++) {
	                String time = String.format("%02d:%02d", hour, minute);
	                if ((hour / 10 == minute % 10) && (hour % 10 == minute / 10)) {
	                    System.out.println(time);
	                    count++;
	                }
	            }
	        }
	        System.out.println("Количество симметричных комбинаций: " + count);
	    }
}
