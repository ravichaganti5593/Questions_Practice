import java.util.ArrayList;
import java.util.Stack;


public class postorderIterative {
<<<<<<< HEAD
	public ArrayList<Integer> postorderTraversal(TreeNode a) {
		
		ArrayList<Integer> result = new ArrayList<Integer>();
		
		Stack<TreeNode> stack = new Stack<TreeNode>();
		
		if (a == null) {
		    return result;
		}
		
		TreeNode current = a;
		
		while (current != null) {
			stack.push(current);
			current = current.left;
		}
		
		while (!stack.isEmpty()) {
			current = stack.pop();
			
			if (current.right != null) {
				current = current.right;
				
				while (current != null) {
					stack.push(current);
					current = current.left;
				}
				
			}		
			
		}
		
		return result;
	}
=======
	  public ArrayList<Integer> postorderTraversal(TreeNode a) {
	        ArrayList<Integer> result = new ArrayList<Integer>();
	        Stack<TreeNode> stack = new Stack<TreeNode>();
	        if(a == null)
	            return result;
	        TreeNode node = a;
	        while(!stack.isEmpty() || node != null){
	            while(node != null){
	                if(node.right != null)
	                    stack.push(node.right);
	                stack.add(node);
	                node = node.left;
	            }
	            node = stack.pop();
	            
	            if(node.right != null && !stack.isEmpty() && node.right == stack.peek()){
	                TreeNode rightNode = stack.pop();
	                stack.push(node);
	                node = rightNode;
	            }
	            else{
	                result.add(node.val);
	                node = null;
	            }
	        }
	        return result;
	    }
>>>>>>> upstream/master
}
