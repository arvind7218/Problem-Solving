class Solution {
public:
    ListNode* removeNthFromEnd(ListNode* head, int n) {
        if(head == NULL || head->next == NULL) return NULL;

        int count = 0;
        ListNode* Curr = head;

        while(Curr){
            count++;
            Curr = Curr->next;
        }

        // If removing the first node
        if(count == n) return head->next;

        count = count - n;

        Curr = head;
        ListNode* Prev = NULL;
        ListNode* Next = head->next;

        int i = 0;                       

        while(i < count){                 
            Prev = Curr;
            Curr = Curr->next;
            Next = Curr->next;
            i++;                           
        }

        Prev->next = Next;

        return head;
    }
};