// problem link
// https://www.hackerrank.com/challenges/print-the-elements-of-a-linked-list/problem

    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }

    }