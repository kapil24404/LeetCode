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
     public ListNode reverseList(ListNode head) {
       if(head==null|| head.next==null)return head;
        ListNode newNode =reverseList(head.next);
        head.next.next=head;
        head.next=null;
        return newNode;
        }
   public int getDecimalValue(ListNode head) {
        ListNode reverse = reverseList(head);
        int power = 0;
        int result = 0;

        // Traverse the reversed list
        while (reverse != null) {
            result += reverse.val * Math.pow(2, power);
            power++;
            reverse = reverse.next;
        }
        return result;
    }
}