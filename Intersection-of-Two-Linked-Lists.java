/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int size1=0,size2=0;
        ListNode tempA=headA;
        ListNode tempB=headB;
        while(tempA!=null){
            size1++;
            tempA=tempA.next;
        }
        while(tempB!=null){
            size2++;
            tempB=tempB.next;
        }
         ListNode slow=headB;
         ListNode fast=headA;
        if(size1>size2){
            int diff = size1 - size2;
            while(diff>0){
                diff--;
                fast=fast.next;
            }
        }
        else{
           int diff = size2 - size1;
            while(diff>0){
                diff--;
                slow=slow.next;
            }
        }
        while(fast!=null &&slow!=null){
            if(slow==fast) return slow;
            slow=slow.next;
            fast=fast.next;
        }
        return null;
    }
}