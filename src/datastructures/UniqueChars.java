package datastructures;

//Implement an algorithm to determine if a string has all unique characters.
//What if you can not use additional data structures?

public class UniqueChars{
	
	private static String unique_string = null;
	private static Boolean bool = false;
	
	public static void main(String [] args){


		unique_string = "this is a unique string";
		bool = checkUniqueCharacters(unique_string);

		if(bool)
			System.out.println("the sentence has unique characters");
		else
			System.out.println("the sentence does not have unique characters");

	}

	
	/*
	 * solution 1. here we use an array of booleans that are set to true
	 * 				if they encounter a variable. 
	 * runtime (O(n))
	 * 
	 * other solutions
	 *   - we could sort the string (O(n log n)) then go through the string 
	 *   	if two variables are same the we return false.
	 *   - we could use two forloops (O(n^2)) no extra space needed. 
	 *   	we compare each word with every other word.
	 * 
	 * @param s the string to be check for character uniqueness
	 * @return true if there sentence has unique characters else false.
	 */
	public static boolean checkUniqueCharacters(String s){
		
		//assuming the sentences are  ASCII 
		boolean char_set[] = new boolean[256];

		for(int i=0; i<s.length(); i++){
			int value = s.charAt(i);

			if(char_set[value])
				return false;
			char_set[value]=true;

		}
		return true;
	}

	 
}