// problem link
// https://www.hackerrank.com/challenges/find-the-merge-point-of-two-joined-linked-lists/problem



    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode n1 = head1;
        SinglyLinkedListNode n2 = head2;
        int lenA = 0;
        int lenB = 0;
        while(n1 != null){
            lenA++;
            n1 = n1.next;
        }
        while(n2 != null){
            lenB++;
            n2 = n2.next;
        }
        int d = lenA - lenB;
        if(d < 0){
            // 2nd list is longer
            // attach new nodes in front of 1st list
            while(d != 0){
                SinglyLinkedListNode t = new SinglyLinkedListNode(0);
                t.next = head1;
                head1 = t;
                d++;
            }
        }
        if(d > 0){
            while(d != 0){
                SinglyLinkedListNode t = new SinglyLinkedListNode(0);
                t.next = head2;
                head2 = t;
                d--;
            }
        }
        while(head1 != null && head2 != null){
            if(head1 == head2) return head1.data;
            head1 = head1.next;
            head2 = head2.next;
        }
        return -1;
    }

