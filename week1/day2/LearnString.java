package week1.day2;

public class LearnString {

	public static void main(String[] args) {
		
		// Approach 1) String literal -> Memory better managed
		String company = "Bank of America";
		
		// Approach 2) String Object -> More memory - every object
		String str = new String("Bank of America");
		
		// String methods -> syntax variable name / object reference 
		
		// 1) How many characters?
		int length = company.length();
		System.out.println(length);
		
		// 2) Convert String to individual characters 
		char[] charArray = company.toCharArray();
		System.out.println(charArray);
		
		// 3) Convert to lowercase or uppercase
		String lowerCase = company.toLowerCase();
		System.out.println(lowerCase);
		System.out.println(company.toUpperCase());
		
		// 4) Check if the Substring exist
		System.out.println(company.contains("of"));
		
		// 5) Check if the String ends-with
		System.out.println(company.endsWith("rica"));
		System.out.println(company.startsWith("Bank"));
		
		// 6) Find out the index of the character
		System.out.println(company.indexOf('a'));
		System.out.println(company.lastIndexOf('a'));
		
		// 7) Exact Matches 
		boolean equals = company.equals("Bank of America");
		System.out.println(equals);
		
		boolean equalsIgnoreCase = company.equalsIgnoreCase("bank Of America");
		System.out.println(equalsIgnoreCase);
		
		// 8) What character resides in this index?
		System.out.println(company.charAt(company.length()-1));
		
		// 9) Split the String
		String[] split = company.split(" ");
		System.out.println(split.length);
		
		// 10) Replace 
		String replacedText = company.replace("America", "India");
		System.out.println(replacedText);
		
		String replacedText1 = company.replace('a', 'A');
		System.out.println(replacedText1);
		
		
		
		

	}

}
