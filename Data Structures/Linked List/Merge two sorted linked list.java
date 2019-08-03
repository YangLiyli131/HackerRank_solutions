// problem link
// https://www.hackerrank.com/challenges/merge-two-sorted-linked-lists/problem

 

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode dummy = new SinglyLinkedListNode(0);
        SinglyLinkedListNode head = dummy;
        while(head1 != null && head2 != null){
            if(head1.data <= head2.data){
                dummy.next = head1;
                head1 = head1.next;
            }else{
                dummy.next = head2;
                head2 = head2.next;
            }
            dummy = dummy.next;
        }
        if(head1 != null) dummy.next = head1;
        if(head2 != null) dummy.next = head2;
        return head.next;
    }



