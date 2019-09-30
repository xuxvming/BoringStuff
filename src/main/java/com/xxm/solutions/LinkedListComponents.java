package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;
import com.xxm.solutionhelpers.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListComponents extends AbstractSolution {
    public LinkedListComponents(String questionName, String url) {
        super(questionName, url);
    }

    /*
    * Connected components in G must occur consecutively in the linked list.
    * if curr.val in G and curr.next val is not, then this is the end of the connected component. */
    public int numComponents(ListNode head, int[] G) {
        List<Integer> arr  = new ArrayList();

        for (int x: G) arr.add(x);
        int res = 0;
        ListNode curr = head;
        while (curr != null){
            if (arr.contains(curr.val)&& (curr.next== null || !arr.contains(curr.next.val))){
                res ++;
            }
            curr = curr.next;
        }
        return res;
    }
}
