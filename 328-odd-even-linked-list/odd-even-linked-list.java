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
    public ListNode oddEvenList(ListNode head) {
        if(head == null) return null;
        ListNode odd = new ListNode(0);
        ListNode temp = odd;
        ListNode even = new ListNode(0);
        ListNode evenTemp = even;

        ListNode curr = head;
        int count = 1;

        while(curr != null){
            if(count % 2 == 0){
                even.next = curr;
                even = even.next;
            }
            else{
                odd.next = curr;
                odd = odd.next;
            }
            curr = curr.next;
            count++;
        }
        even.next = null;
        odd.next = evenTemp.next;
        return temp.next;

    }
}