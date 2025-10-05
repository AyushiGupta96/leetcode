public class Link_list_intersection {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        Set<ListNode> n = new HashSet<ListNode>();
        while(headB!=null){
            n.add(headB);
            headB=headB.next;
        }
        while(headA!=null){
            if(n.contains(headA)){
                return headA;
            }
            headA=headA.next;
        }
        return null;
    }
}
