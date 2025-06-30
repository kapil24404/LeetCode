/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode middle(ListNode head){
        if(head==null|| head.next==null) return head;
        ListNode slow=head;
        ListNode fast=head;
        while(fast.next!=null && fast.next.next!=null){
            slow=slow.next;
            fast=fast.next.next;
        }
        return slow;
    }
    public ListNode reverse(ListNode head){
        if(head==null|| head.next==null) return head;
        ListNode newhead=reverse(head.next);
        head.next.next=head;
        head.next=null;
        return newhead;
    }
    public boolean isPalindrome(ListNode head) {
        ListNode temp=head;
        ListNode mid=middle(head);
        ListNode rev=reverse(mid.next);
        ListNode temp1=rev;
        while(temp1!=null){
            if(temp.val!=temp1.val){
                return false;
            }
            temp=temp.next;
            temp1=temp1.next;
        }
        return true;
    }
}