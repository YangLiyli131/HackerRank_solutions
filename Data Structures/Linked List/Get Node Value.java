// problem link
// https://www.hackerrank.com/challenges/get-the-value-of-the-node-at-a-specific-position-from-the-tail/problem
 
    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        SinglyLinkedListNode h = head;
        int len = 0;
        while(h!= null){
            h = h.next;
            len++;
        }
        int d = len - positionFromTail;
        SinglyLinkedListNode hh = head;
        while(d-1 != 0){
            hh = hh.next;
            d--;
        }
        return hh.data;
    }


