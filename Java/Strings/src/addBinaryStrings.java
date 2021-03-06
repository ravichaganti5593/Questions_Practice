/*
 * Given two binary strings, return their sum (also a binary string).

Example:

a = "100"

b = "11"
Return a + b = �111�.
 */
public class addBinaryStrings {
	public static String addBinary(String a, String b) {
	    
		 if (a == null || b == null) return "";
		 
		    int first = a.length() - 1;
		    int second = b.length() - 1;
		    StringBuilder sb = new StringBuilder();
		    int carry = 0;
		    
		    while (first >= 0 || second >= 0) {
		        int sum = carry;
		        
		        if (first >= 0) {
		            sum += a.charAt(first) - '0';
		            first--;
		        }
		        
		        if (second >= 0) {
		            sum += b.charAt(second) - '0';
		            second--;
		        }
		        
		        carry = sum >> 1;
		        System.out.println("carry" + carry);
		        sum = sum & 1;
		        System.out.println("sum" + sum);
		        sb.append(sum == 0 ? '0' : '1');
		        System.out.println(sb);
		    }
		    
		    if (carry > 0)
		        sb.append('1');
		
		    sb.reverse();
		    return String.valueOf(sb);
			    
	    
	}
	
	public static void main (String[] args) {
		addBinary("101", "1");
	}
}
