// problem link
// https://www.hackerrank.com/challenges/insert-a-node-at-the-head-of-a-linked-list/problem

    // Complete the insertNodeAtHead function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtHead(SinglyLinkedListNode llist, int data) {
        SinglyLinkedListNode newN = new SinglyLinkedListNode(data);
        if(llist == null){
            llist = newN;
        }else{
            newN.next = llist;
            llist = newN;
        }
        return llist;
    }