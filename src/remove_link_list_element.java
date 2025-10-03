public class remove_link_list_element {
    public ListNode removeElements(ListNode head, int val) {
        ListNode i = new ListNode(0);
        i.next = head;
        ListNode prev = i ,curr = head;
        while (curr != null) {
            if (curr.val == val) {
                prev.next = curr.next;
            } else {
                prev = curr;
                curr = curr.next;
            }

        }
        return i.next;
    }
}