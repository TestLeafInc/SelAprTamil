package week1.day1;

public class RunExample {

	public static void main(String[] args) {
		
		/*
		 * Problem Statement
		 * 
		 * Numbers between 1 to 100
		 * If the number is divisible by 3 -> TAN
		 * If the number is divisible by 5 -> PAN
		 * If the number is divisible by 3 and 5 -> TANPAN
		 * else do nothing
		 */
		
		for (int i = 1; i <= 100; i++) {
			
			if(i%3 ==0 && i%5 == 0) {
				System.out.println("The number is : "+i+" and the value is TANPAN");
			}else if(i % 3 == 0) {
				System.out.println("The number is : "+i+" and the value is PAN");
			} else if(i%5 == 0) {
				System.out.println("The number is : "+i+" and the value is TAN");
			} 
			
			
		}
		
		

	}

}
