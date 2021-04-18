package week1.day2;

public class RemoveVowels {
	
	/*
		Given a string s, 
		remove the vowels 'a', 'e', 'i', 'o', and 'u' from it, 
		and return the new string.

		Example 1:

			Input: s = "testleaf"
			Output: "tstlf"
		
		Example 2:

			Input: s = "aeiou"
			Output: ""
			
		
		Psuedocode
		
		1) Convert String to character array
		2) Check if is not particular character is either a or e or i or i or u
		3) you just print 
			
	*/
	
	
	public static void main(String[] args) {
		
		String input = "TestLeAf";
		
		/*char[] chars = input.toCharArray();
		for (int i = 0; i < chars.length; i++) {
			if(chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i'  || chars[i] == 'o' || chars[i] == 'u' ) {
				
			}else {
				System.out.print(chars[i]);
			}
			
		}*/
		
		/*
		String replace = input.replace("a", "").replace("e", "").replace("i", "").replace("o", "").replace("u", "");
		System.out.println(replace); */
		
		String replaceAll = input.replaceAll("[uiaeoAEIOU]", "");
		System.out.println(replaceAll);
		
	}

}
