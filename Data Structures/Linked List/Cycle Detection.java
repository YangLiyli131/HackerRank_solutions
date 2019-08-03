// problem link
// https://www.hackerrank.com/challenges/detect-whether-a-linked-list-contains-a-cycle/problem



    // Complete the hasCycle function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean hasCycle(SinglyLinkedListNode head) {
        if(head == null){
            return false;
        }
        SinglyLinkedListNode h1 = head;
        SinglyLinkedListNode h2 = head;
        while(h2 != null && h2.next != null){
            h1 = h1.next;
            h2 = h2.next.next;
            if(h1 == h2){
                return true;
            }
        }
        return false;
    }

