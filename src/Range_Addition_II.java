public class Range_Addition_II {
    /**  You are given an m x n matrix M initialized with all 0's and an array of operations ops, where ops[i] = [ai, bi] means M[x][y] should be incremented by one for all 0 <= x < ai and 0 <= y < bi.

     Count and return the number of maximum integers in the matrix after performing all the operations.
     Input: m = 3, n = 3, ops = [[2,2],[3,3]]
     Output: 4
     Explanation: The maximum integer in M is 2, and there are four of it in M. So return 4.
     Example 2:

     Input: m = 3, n = 3, ops = [[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3],[2,2],[3,3],[3,3],[3,3]]
     Output: 4
     Example 3:

     Input: m = 3, n = 3, ops = []
     Output: 9

     Time complexity : O(x∗m∗n). Array is updated x times, where x represents number of times operation is preformed i.e. ops.length.

     Space complexity : O(m∗n). Array of size m∗n is used.
     */
    public int maxCount(int m, int n, int[][] ops) {
        int[][] arr = new int[m][n];
        for(int[] op:ops){
            for(int i=0;i<op[0];i++){
                for(int j=0;j<op[1];j++){
                    arr[i][j]+=1;
                }
            }
        }
        int count =0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(arr[i][j] == arr[0][0])
                    count++;
            }
        }
        return count;
    }
}
