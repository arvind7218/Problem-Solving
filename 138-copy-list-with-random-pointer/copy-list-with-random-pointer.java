class Solution {
    public Node copyRandomList(Node head) {
        if(head == null) return null;

        Node curr = head;

        while(curr != null){
            Node node = new Node(curr.val);
            Node currNext = curr.next;
            node.next = currNext;
            curr.next = node;
            curr = currNext;   
        }

        curr = head;
        while(curr != null){
            Node newNode = curr.next;
            newNode.random = curr.random != null ? curr.random.next : null;
            curr = curr.next.next;
        }

        Node oldHead = head;
        Node newHead = head.next;
        Node resultHead = newHead;

        while(oldHead != null){
            oldHead.next = newHead.next;
            newHead.next = oldHead.next != null ? oldHead.next.next : null;

            oldHead = oldHead.next;       // updated
            newHead = newHead.next;       // updated
        }

        return resultHead;
    }
}