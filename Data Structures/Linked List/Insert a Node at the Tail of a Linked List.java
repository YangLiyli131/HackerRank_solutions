// problem link
// https://www.hackerrank.com/challenges/insert-a-node-at-the-tail-of-a-linked-list/problem

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newN = new SinglyLinkedListNode(data);
        if(head == null){
            head = newN;
        }else{
            SinglyLinkedListNode newhead = head;
            while(newhead.next != null){
                newhead = newhead.next;
            }
            newhead.next = newN;
        }
        return head;
    }