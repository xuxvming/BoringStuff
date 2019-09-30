package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;
import com.xxm.solutionhelpers.TreeNode;

public class ConvertSortedArrayToBST extends AbstractSolution {
    public ConvertSortedArrayToBST(String questionName, String url) {
        super(questionName, url);
    }

    /*
    * the sorted array is the result of the inorder traversal
    * therefore, the elements before the middle one should all be in the left sub tree
    * the elements after the middle one should all be in the right subtree
    * recursively adding the left and right sub tree to the root.
    * Space complexity O(n)
    * Time complexity O(logn) as using binary search*/
    public TreeNode sortedArrayToBST(int[] nums) {
        if(nums.length == 0){
            return null;
        }
        return add(nums,0,nums.length-1);
    }
    public TreeNode add(int[] nums, int start, int end){
        if (start > end){
            return null;
        }
        int mid = start + (end - start)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = add(nums,start,mid-1);
        root.right = add(nums, mid+1,end);
        return root;
    }

}
