package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;

import javax.swing.tree.TreeNode;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class InOrderTraversal extends AbstractSolution {
    public InOrderTraversal(String questionName, String url) {
        super(questionName, url);
    }

    /**
     * keep adding the left nodes until it's null
     * the top node in the stack will be the one that is most far way from the root
     * update curr with top node in the stack
     * look after the right node */
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList();
        Stack<TreeNode> stack = new Stack();
        TreeNode curr = root;
        while (!stack.empty() || curr!= null ){
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            curr = stack.pop();
            res.add(curr.val);
            curr = curr.right;
        }
        return res;
    }

    public class TreeNode {
     int val;
     TreeNode left;
     TreeNode right;
     TreeNode(int x) { val = x; }}
}
