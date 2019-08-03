// problem link
// https://www.hackerrank.com/challenges/delete-a-node-from-a-linked-list/problem

    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position == 0){
            head = head.next;
        }else{
            SinglyLinkedListNode newH = head;
            for(int i = 0; i < position-1; i++){
                newH = newH.next;
            }
            SinglyLinkedListNode nex = newH.next.next;
            newH.next = nex;
        }
        return head;
    }