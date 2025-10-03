public class reverse_link_list {
    public ListNode reverseList(ListNode head) {
        /**
         Time complexity : O(n).
         Assume that n is the list's length, the time complexity is O(n).

         Space complexity : O(1).
         */
        ListNode prev = null;
        ListNode curr = head;
        while(curr!=null){
            ListNode t= curr.next;// t=2
            curr.next = prev;//2=null
            prev = curr;// null=1
            curr=t;// null =t
        }
        return prev;
    }
}
