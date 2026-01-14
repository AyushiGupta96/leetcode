public class ReverseLinkedListII {
    /** Given the head of a singly linked list and two integers left and right where left <= right, reverse the nodes of the list from position left to position right, and return the reversed list.



     Example 1:


     Input: head = [1,2,3,4,5], left = 2, right = 4
     Output: [1,4,3,2,5]
     Example 2:

     Input: head = [5], left = 1, right = 1
     Output: [5]
     Time Complexity: O(N) since we process all the nodes at-most twice. Once during the normal recursion process and once during the backtracking process. During the backtracking process we only just swap half of the list if you think about it, but the overall complexity is O(N).
     Space Complexity: O(N) in the worst case when we have to reverse the entire list. This is the space occupied by the recursion stack.*/
    //object level variables since we need the changes to persist across recursive calls andjava is passed by value.
    private boolean stop;
    private ListNode t;
    public void recurseAndreverse(ListNode right, int m,int n){
        //base case.Don't proceed any further
        if( n==1){
            return;
        }
        //keep moving thr right pointer one step forward until (n==1)
        right = right.next;
        //keep moving t pointer to the right until we reach the proper node from where the reversal is to start
        if(m > 1){
            this.t = this.t.next;
        }
        //Recurse with m and n reduced.
        this.recurseAndreverse(right,m-1,n-1);
        // in case both the pointers cross each other or become equal, we stop i.e don't swap data any further . We are donereversing at this point
        if(this.t == right || right.next == this.t){
            this.stop = true;
        }
        //until the boolean stop is false, swap data between the two pointers
        if(!this.stop){
            int i = this.t.val;
            this.t.val = right.val;
            right.val = i;
            //move t one step to the right.
            //the right pointer moves one step back via backtracking
            this.t = this.t.next;
        }
    }
    public ListNode reverseBetween(ListNode head, int m, int n) {
        this.t = head;
        this.stop = false;
        this.recurseAndreverse(head,m,n);
        return head;
    }
}
