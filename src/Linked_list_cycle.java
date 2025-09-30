import java.util.*;
import java.util.LinkedList;
import java.util.List;
public class Linked_list_cycle {
    public boolean hasCycle(ListNode head) {
        ListNode i= head;
        ListNode j=head;
        while(i!=null && i.next!=null){
            j=j.next;
            i=i.next.next;
            if(i==j)
                return true;
        }
        return false;
    }
}
