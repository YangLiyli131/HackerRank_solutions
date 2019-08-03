// problem link
// https://www.hackerrank.com/challenges/compare-two-linked-lists/problem

    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode h1 = head1;
        SinglyLinkedListNode h2 = head2;
        while(h1 != null && h2 != null){
            if(h1.data != h2.data){
                return false;
            }else{
                h1 = h1.next;
                h2 = h2.next;
            }
        }
        if(h1 == null && h2 == null) return true;
        else if(h1 == null && h2 != null) return false;
        else return false;
    }