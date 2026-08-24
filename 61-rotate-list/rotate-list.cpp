class Solution {
public:
    ListNode* rotateRight(ListNode* head, int k) {
  
        if(head == NULL || head->next == NULL) return head;     

        ListNode* dummy = head;
        int count = 0;

        while(dummy){
            dummy = dummy->next;
            count++;
        }

        k = k % count;

        if(k == 0) return head;

        count = count - k - 1;

        dummy = head;
         
        while(count){
            dummy = dummy->next;
            count--;
        }

        ListNode* temp = dummy->next;
        dummy->next = NULL;

        ListNode* newHead = temp;

        while(temp->next){
            temp = temp->next;
        }

        temp->next = head;

        return newHead;
    }
};