/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {

        ListNode* dummy = new ListNode(0);

        // curr is used to create the answer list
        ListNode* curr = dummy;

        // Carry from previous addition
        int carry = 0;

        // Continue until both lists are finished
        // and there is no remaining carry
        while (l1 != NULL || l2 != NULL || carry != 0) {

            int sum = carry;

            // Add value from l1
            if (l1 != NULL) {
                sum += l1->val;
                l1 = l1->next;
            }

            // Add value from l2
            if (l2 != NULL) {
                sum += l2->val;
                l2 = l2->next;
            }

            // Create a new node containing the last digit
            curr->next = new ListNode(sum % 10);

            // Calculate carry
            carry = sum / 10;

            // Move curr to the newly created node
            curr = curr->next;
        }
        return dummy->next;
    }
};