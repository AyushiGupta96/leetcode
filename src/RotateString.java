public class RotateString {
    public boolean rotateString(String s, String goal) {
        //check if the length are different
        if(s.length()!=goal.length()){
            return false;
        }
        //create a new string by concatenating 's' with itself
        String doubleString = s+s;
        //use contains to search for goal in doubleString
        //if contains return true, 'goal' is a substring
        return doubleString.contains(goal);
    }
}
