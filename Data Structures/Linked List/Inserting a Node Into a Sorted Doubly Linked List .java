// problem link
// https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem

    // Complete the sortedInsert function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        DoublyLinkedListNode newNode = new DoublyLinkedListNode(data);
        DoublyLinkedListNode dummy = new DoublyLinkedListNode(0);
        DoublyLinkedListNode d2 = dummy;
        dummy.next = head;
        boolean added = false;
        while(dummy.next != null){
            if(dummy.next.data > data){
                newNode.next = dummy.next;
                dummy.next = newNode;
                newNode.prev = dummy;
                dummy.next.prev = newNode;
                added = true;
                break;
            }
            dummy = dummy.next;
        }
        if(!added){
            dummy.next = newNode;
            newNode.prev = dummy;
        }
        return d2.next;
    }