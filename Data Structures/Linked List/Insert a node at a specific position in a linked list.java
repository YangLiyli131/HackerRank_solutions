// problem link
// https://www.hackerrank.com/challenges/insert-a-node-at-a-specific-position-in-a-linked-list/problem

    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
        SinglyLinkedListNode newN = new SinglyLinkedListNode(data);
        if(position == 0){
            newN.next = head;
            head = newN;
        }else{
            SinglyLinkedListNode newHead = head;
            for(int i = 0; i < position-1; i++){
                newHead = newHead.next;
            }
            SinglyLinkedListNode nex = newHead.next;
            newHead.next = newN;
            newN.next = nex;
        }
        return head;
    }