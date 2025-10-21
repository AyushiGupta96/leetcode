public class maximum_number3 {
    public int thirdMax(int[] nums) {
        //sorted set to keep elements in sorted order.
        TreeSet<Integer> t = new TreeSet<Integer>();
        //Iterate on all elements of  'nums' array.
        for (int n : nums) {
            //do not insert same element again
            if (t.contains(n)) {
                continue;
            }
            //if sorted set has 3 element
            if (t.size() == 3) {
                //and  smallest element is smaller than current element.
                if (t.first() < n) {
                    //Then remove smallest element and push current element.
                    t.pollFirst();
                    t.add(n);
                }
            }
            //otherwise push current element of nums array.
            else {
                t.add(n);
            }
        }
        //if sorted set has three elements return smallest among those 3.
        if (t.size() == 3) {
            return t.first();
        }
        //otherwise return the biggest element of nums array.
        return t.last();
    }
}