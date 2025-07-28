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
    public static ListNode reverse(ListNode head){
        if(head==null ||head.next==null) return head;
        ListNode prev=null;
        ListNode temp=head;
        while(temp!=null){
            ListNode agla=temp.next;
            temp.next=prev;
            prev=temp;
            temp=agla;
        }
        return prev;
    }
    public int getDecimalValue(ListNode head) {
        if(head==null ||head.next==null) return head.val;
        ListNode curr=reverse(head);
        int size=0;
        ListNode temp=curr;
        while(temp!=null){
            size++;
            temp=temp.next;
        }
        System.out.print(size);
        int ans=0;
        for(int i=0;i<size;i++){
            ans+=curr.val*Math.pow(2,i);
            curr=curr.next;
        }
        return ans;
    }
}