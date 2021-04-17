package week1.day1;

public class OddOrEven {

	public static void main(String[] args) {
		
		// + (add) - (sub)  * (mul) / (div -> quo) % (mod -> rem) 
		
		//int num = 10;
		
		// loop -> same code -> multiple times run 
		for (int i = 0; i <= 50; i++) {
			
			if(i ==0) { // yes -> do this, no p-> do other 
				System.out.println("This is neutral number "+i);
			}else if(i%2 == 0) {
				System.out.println("This is even number "+i);
			} else {
				System.out.println("This is odd number "+i);
			}
			
		}
		
		

	}

}
