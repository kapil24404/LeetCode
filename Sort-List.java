class Solution {
    public ListNode getMiddle(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast != null && fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public ListNode merge(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                tail.next = l1;
                l1 = l1.next;
            } else {
                tail.next = l2;
                l2 = l2.next;
            }
            tail = tail.next;
        }

        // Attach the remaining part
        if (l1 != null) tail.next = l1;
        else tail.next = l2;

        return dummy.next;
    }

    public ListNode sortList(ListNode head) {
        
        if (head == null || head.next == null) {
            return head;
        }

        ListNode middle = getMiddle(head);
        ListNode right = middle.next;
        middle.next = null;

        ListNode leftSort = sortList(head);
        ListNode rightSort = sortList(right);

        return merge(leftSort, rightSort);
    }
}