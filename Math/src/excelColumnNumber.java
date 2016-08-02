/*
 * Given a column title as appears in an Excel sheet, return its corresponding column number.

Example:

    A -> 1
    
    B -> 2
    
    C -> 3
    
    ...
    
    Z -> 26
    
    AA -> 27
    
    AB -> 28 
 */
public class excelColumnNumber {
	public int titleToNumber(String s) {
	    
		   int result = 0;
		   
	       for (int i = 0; i < s.length(); i++) {
	               result = result * 26 + (s.charAt(i) - 'A' + 1);
	       }
	       
	       return result;
		}
}
