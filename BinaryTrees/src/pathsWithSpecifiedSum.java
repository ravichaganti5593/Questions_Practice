import java.util.*;

public class pathsWithSpecifiedSum {
	  
		public ArrayList<ArrayList<Integer>> pathSum(TreeNode root, int sum) {
		  
	        ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	        ArrayList<Integer> temp = new ArrayList<Integer>();
	        
	        if(root == null)
	            return null;
	        
	        // temp.add(root.val);
	        pathSum(root, sum, result, temp);
	        return result;
	        
	    }
	  
	    public void pathSum(TreeNode node, int sum, ArrayList<ArrayList<Integer>> result, ArrayList<Integer> temp) {
	        
	    	if(node == null)
	            return;
	        
	        temp.add(node.val);
	        
	        
	        if(node.left == null && node.right == null){
	            if(sum - node.val == 0){
	                result.add(new ArrayList<Integer>(temp));
	            }
	        }
	        
	        pathSum(node.left, sum - node.val, result, temp);
	        pathSum(node.right, sum - node.val, result, temp);
	        temp.remove(temp.size() - 1);		//don't understand this
	        
	    }
}
