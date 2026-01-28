import java.util.ArrayList;
import java.util.List;

public class PascalTriangleII {
    /** Given an integer rowIndex, return the rowIndexth (0-indexed) row of the Pascal's triangle.

     In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:




     Example 1:

     Input: rowIndex = 3
     Output: [1,3,3,1]
     Example 2:

     Input: rowIndex = 0
     Output: [1]
     Example 3:

     Input: rowIndex = 1
     Output: [1,1]*/
    private int getNum(int row, int col) {
        if (row == 0 || col == 0 || row == col) {
            return 1;
        }

        return getNum(row - 1, col - 1) + getNum(row - 1, col);
    }

    public List<Integer> getRow(int rowIndex) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i <= rowIndex; i++) {
            ans.add(getNum(rowIndex, i));
        }

        return ans;
    }
}
