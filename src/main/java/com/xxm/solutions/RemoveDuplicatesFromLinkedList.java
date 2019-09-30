package com.xxm.solutions;

import com.xxm.solutionhelpers.AbstractSolution;
import com.xxm.solutionhelpers.ListNode;

public class RemoveDuplicatesFromLinkedList extends AbstractSolution {
    public RemoveDuplicatesFromLinkedList(String questionName, String url) {
        super(questionName, url);
    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode curr = head;
        while (curr != null && curr.next != null){

            if (curr.val == curr.next.val){
                curr.next = curr.next.next;
            }
            else{
                curr = curr.next;
            }

        }
        return head;
    }
}
