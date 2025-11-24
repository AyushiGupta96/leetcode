import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Relative_sort_array {
    /**
     * Given two arrays arr1 and arr2, the elements of arr2 are distinct, and all elements in arr2 are also in arr1.
     *
     * Sort the elements of arr1 such that the relative ordering of items in arr1 are the same as in arr2. Elements that do not appear in arr2 should be placed at the end of arr1 in ascending order.
     *
     *
     *
     * Example 1:
     *
     * Input: arr1 = [2,3,1,3,2,4,6,7,9,2,19], arr2 = [2,1,4,3,9,6]
     * Output: [2,2,2,1,4,3,3,9,6,7,19]
     * Example 2:
     *
     * Input: arr1 = [28,6,22,8,44,17], arr2 = [22,28,8,6]
     * Output: [22,28,8,6,17,44]
     * Time complexity: O(m⋅n+nlogn)
     *
     * We iterate through each element of arr2 and for each element, we iterate through arr1. This results in O(m⋅n) time complexity.
     *
     * Sorting arr1 has a time complexity of O(nlogn).
     *
     * Iterating through arr1 to add non-marked elements to the result has a time complexity of O(n).
     *
     * Combining these steps, the overall time complexity is O(m⋅n+nlogn+n), which we can simplify to O(m⋅n+nlogn).
     *
     * Space complexity: O(n) or O(logn)
     *
     * Apart from the result array and a few variables, the algorithm doesn't use any additional data structures that scale with input size. We do not count result array in the space complexity as it's only used to store the output.
     *
     * Note that some extra space is used when we sort arrays in place. The space complexity of the sorting algorithm depends on the programming language.
     *
     * In Python, the sort method sorts a list using the Timsort algorithm which is a combination of Merge Sort and Insertion Sort and has O(n) additional space.
     * In Java, Arrays.sort() is implemented using a variant of the Quick Sort algorithm which has a space complexity of O(logn) for sorting two arrays.
     * In C++, the sort() function is implemented as a hybrid of Quick Sort, Heap Sort, and Insertion Sort, with a worse-case space complexity of O(logn)*/

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        List<Integer> result = new ArrayList<>();
        //traverse through the relative order array.
        for(int i=0;i<arr2.length;i++){
            //traverse through the target array
            for(int j=0;j<arr1.length;j++){
                // if element in target array matches with relative order element.
                if(arr1[j] == arr2[i]){
                    //add it to the result array
                    result.add(arr1[j]);
                    //mark the element in target array as visited
                    arr1[j] = -1;

                }
            }
        }
        //sort the remaining element in the target array
        Arrays.sort(arr1);
        //add the remaining element to the result array
        for(int i=0;i<arr1.length;i++){
            if(arr1[i] != -1){
                result.add(arr1[i]);
            }
        }
        //convert array list to array
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
