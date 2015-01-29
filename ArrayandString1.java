/* Implement an algorithm to determine if a string has all unique characters. What if
you can not use additional data structures? 

My original solution involved using HashSet. Find the size of HashSet created from the characters in the string and compare 
that value with string length. If they are equal, string has all unique characters. I put some regex check up front to avoid 
spaces in that solution.

This is a much more clever solution. Using a single array

*/

public class OptimalBooleanSoln {
	 public static boolean isUniqueChars2(String str) {
	 
	 // A boolean array is initialized with all the 256 elements having by default value as false
	 boolean[] char_set = new boolean[256];
	 
	 for (int i = 0; i < str.length(); i++) {
	 
	 //Find the corresponding ascii value for the character
	 int val = str.charAt(i);
	 
	 //If the char_set array has already value as true for the index position corresponding to ascii value, return false.
	 if (char_set[val]) return false;
	 
	 //Setting the array index corresponding to ascii value to true.
	 char_set[val] = true;
	 }
	 return true;
	 }
	 public static void main(String[] args)
	 {
	  Boolean bool=isUniqueChars2("abcdefga");
	  System.out.println(bool);
	 }
}
