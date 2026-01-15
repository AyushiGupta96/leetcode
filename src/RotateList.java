public class RotateList {
    /** Given the head of a linked list, rotate the list to the right by k places.



     Example 1:


     Input: head = [1,2,3,4,5], k = 2
     Output: [4,5,1,2,3]
     Example 2:


     Input: head = [0,1,2], k = 4
     Output: [2,0,1]
 */
     public ListNode rotateRight(ListNode head, int k) {
        if (head == null) {
            return null;
        }
        ListNode temp = head;
        int size = 1;
        while (temp.next != null) {
            temp = temp.next;
            size++;
        }
        temp.next = head;
        k = k % size;
        for (int i = 0; i < size - k; i++) {
            temp = temp.next;
        }
        head = temp.next;
        temp.next = null;
        return head;
    }
}