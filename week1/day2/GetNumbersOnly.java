package week1.day2;

public class GetNumbersOnly {

	public static void main(String[] args) {
		
		String desc = "Amazon has more than 17,048 employees in chennai";
		
		/*
		char[] charArray = desc.toCharArray();
		for (int i = 0; i < charArray.length; i++) {
			if(Character.isDigit(charArray[i])) {
				System.out.print(charArray[i]);
			}
		}
		*/
		
		String replaceAll = desc.replaceAll("[^0-9]", "");
		System.out.println(replaceAll);

	}

}
