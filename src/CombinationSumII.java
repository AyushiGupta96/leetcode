import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class CombinationSumII {
    /** Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

    Each number in candidates may only be used once in the combination.

    Note: The solution set must not contain duplicate combinations.



    Example 1:

    Input: candidates = [10,1,2,7,6,1,5], target = 8
    Output:
            [
            [1,1,6],
            [1,2,5],
            [1,7],
            [2,6]
            ]
    Example 2:

    Input: candidates = [2,5,2,1,2], target = 5
    Output:
            [
            [1,2,2],
            [5]
            ]
     Create a list list to store all the unique combinations that sum up to the target.

     Sort the candidates array to handle duplicates and facilitate the backtracking process.

     Call the backtrack function with the following parameters:

     answer: List to store the final combinations.
     tempList: Temporary list to store the current combination.
     candidates: Input array of numbers.
     totalLeft: Remaining sum to reach the target.
     index: Starting index for the current recursion.
     Within the backtrack function:

     If totalLeft is less than 0, return immediately (invalid path).
     If totalLeft equals 0:
     Add a copy of tempList to answer (valid combination found).
     Otherwise:
     Iterate over candidates starting from index:
     Skip duplicate numbers by checking if candidates[i] == candidates[i - 1] for i > index.
     Add candidates[i] to tempList.
     Recursively call backtrack with:
     Updated totalLeft reduced by candidates[i].
     Updated index as i + 1 to avoid reusing the same element.
     Remove the last element from tempList to backtrack and explore other possibilities.
     Return list containing all unique combinations after the recursive calls complete
 **/
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        Arrays.sort(candidates);
        backtrack(list,new ArrayList<Integer>(), candidates,target,0);
        return list;
    }
    private void backtrack(List<List<Integer>> answer,List<Integer> tempList, int[] candidates, int totalLeft, int index)
    {
        if(totalLeft < 0){
            return;
        }
        else if(totalLeft == 0){
            //Add to the naswer array, if sum is equal to  target.
            answer.add(new ArrayList<>(tempList));
        }
        else{
            for(int i= index;i< candidates.length &&  candidates[i] <= totalLeft  ; i++){
                if(i > index && candidates[i] == candidates[i-1])
                    continue;
                //Add it to tempList.
                tempList.add(candidates[i]);
                //check for all possible scenarios.
                backtrack(answer,tempList,candidates,totalLeft - candidates[i],i+1);
                //backtrack the templlist.
                tempList.remove(tempList.size() - 1);
            }

        }
    }
}
