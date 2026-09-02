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
    public ListNode removeElements(ListNode head, int val) {
      if(head == null) return null;

      ListNode curr = head;
      ListNode temp = new ListNode(0);
      ListNode dummy = temp;

      while(curr != null){
         if(curr.val != val){
            temp.next = curr;
            temp = temp.next;
         }
         curr = curr.next;
      }
      temp.next = null;
      return dummy.next;
    }
}