// problem link
// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list-in-reverse/problem

    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void reversePrint(SinglyLinkedListNode head) {
        if(head != null){
            reversePrint(head.next);
            System.out.println(head.data);
        }
    }
