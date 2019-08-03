// problem link
// https://www.hackerrank.com/challenges/delete-duplicate-value-nodes-from-a-sorted-linked-list/problem

    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
HashSet<Integer> hs = new HashSet<>();
        hs.add(head.data);
        SinglyLinkedListNode newH = head;
        SinglyLinkedListNode pre = head;
        SinglyLinkedListNode cur = pre.next;
        while(cur != null){
            if(!hs.contains(cur.data)){
                hs.add(cur.data);
                pre = cur;
                cur = cur.next;
            }else{
                pre.next = cur.next;
                cur = cur.next;
            }
        }
        return newH;

    }

