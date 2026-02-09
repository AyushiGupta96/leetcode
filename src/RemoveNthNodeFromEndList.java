public class RemoveNthNodeFromEndList {
    /**
     * Given the head of a linked list, remove the nth node from the end of the list and return its head.
     *
     *
     *
     * Example 1:
     *
     *
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * Example 2:
     *
     * Input: head = [1], n = 1
     * Output: []
     * Example 3:
     *
     * Input: head = [1,2], n = 1
     * Output: [1]
     * Input: head = [1,2,3,4,5], n = 2
     * Output: [1,2,3,5]
     * Example 2:
     *
     * Input: head = [1], n = 1
     * Output: []
     * Example 3:
     *
     * Input: head = [1,2], n = 1
     * Output: [1]
     *  */
    class Solution {
        public ListNode removeNthFromEnd(ListNode head, int n) {
            //find length of list
            int length = 0;
            ListNode curr = head;
            while(curr != null){
                curr = curr.next;
                length++;
            }
            if(length == n){
                return head.next;
            }
            //find node to remove index = length -n-1
            int remove = length - n-1;
            curr = head;
            for(int i=0;i < romove ;i++){
                curr = curr.next;
            }
            curr.next = curr.next.next;
            return head;
        }
    }
}
