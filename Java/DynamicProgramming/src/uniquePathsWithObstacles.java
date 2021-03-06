import java.util.*;

public class uniquePathsWithObstacles {
	public int uniquePathsWithObstaclesMethod(ArrayList<ArrayList<Integer>> a) {
	    if(a==null||a.size()==0) {
	        return 0;
	    }

	 
	    int m = a.size();
	    int n = a.get(0).size();
	 
	    if(a.get(0).get(0)==1||a.get(m-1).get(n-1)==1) {
	        return 0;
	    }

	    int[][] dp = new int[m][n];
	    dp[0][0]=1;
	 
	    //left column
	    for(int i = 1; i < m; i++) {
	        
	    	if(a.get(i).get(0) == 1) {
	            dp[i][0] = 0;
	        }
	        
	        else {
	            dp[i][0] = dp[i-1][0];
	        }
	    }
	 
	    //top row
	    for(int i = 1; i < n; i++) {
	        
	    	if(a.get(0).get(i) == 1) {
	            dp[0][i] = 0;
	        }
	    	
	    	else {
	            dp[0][i] = dp[0][i-1];
	        }
	    }
	 
	    //fill up cells inside
	    for(int i = 1; i < m; i++) {
	        for(int j = 1; j < n; j++) {
	            
	        	if(a.get(i).get(j) == 1) {
	                dp[i][j] = 0;
	            }
	            
	            else {
	                dp[i][j] = dp[i-1][j] + dp[i][j-1];
	            }
	 
	        }
	    }
	 
	    return dp[m-1][n-1];
	}
}
