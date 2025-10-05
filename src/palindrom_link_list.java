import java.util.ArrayList;
import java.util.List;

public class palindrom_link_list {
    /**
     Input: head = [1,2,2,1]
     Output: true

     Input: head = [1,2]
     Output: false
     Time complexity : O(n), where n is the number of nodes in the Linked List.
     Space complexity : O(n), where n is the number of nodes in the Linked List.
     */
    public boolean isPalindrome(ListNode head) {
        List<Integer> n = new ArrayList<>();
        //convert linked List into ArrayList
        ListNode curr =head;
        while(curr!=null){
            n.add(curr.val);
            curr=curr.next;
        }
        //reverse n arraylist
        List<Integer> rev=new ArrayList<>();
        for(int i=n.size()-1;i>=0;i--){
            rev.add(n.get(i));
        }
        //check if two array list are equal to each other
        for(int i=0;i<n.size()-1;i++){
            if(n.get(i)!=rev.get(i)){
                return false;
            }
        }
        return true;
    }
}
