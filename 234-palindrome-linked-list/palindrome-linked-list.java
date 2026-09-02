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
    
    public ListNode reverse(ListNode head){

        ListNode prev = null;
        ListNode curr = head;

        while(curr != null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }
        return prev;
    }

    public boolean isPalindrome(ListNode head) {
    
        if(head == null) return false;

        // Create a copy of the original list
        ListNode temp = head;
        ListNode copyHead = new ListNode(temp.val);
        ListNode copy = copyHead;

        temp = temp.next;

        while(temp != null){
            copy.next = new ListNode(temp.val);
            copy = copy.next;
            temp = temp.next;
        }

        // Reverse the copied list
        ListNode newNode = reverse(copyHead);

        // Compare original list with reversed list
        temp = head;

        while(temp != null){
            if(temp.val != newNode.val) return false;

            temp = temp.next;
            newNode = newNode.next;
        }

        return true;
    }
}