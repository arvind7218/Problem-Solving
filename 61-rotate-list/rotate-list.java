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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null) return null;

        ListNode temp = head;
        int count = 0;

        while(temp != null){
            temp = temp.next;
            count++;
        }

        k = k % count;
        temp = head;
        
        if(k == 0) return head;
        count = count - k - 1;
        
        while(count != 0){
            temp = temp.next;
            count--;
        }
        ListNode dummy = temp.next;
        temp.next = null;

        ListNode headp = dummy;
        while(dummy.next != null){
            dummy = dummy.next;
        }
        dummy.next = head;
        return headp;

    }
}