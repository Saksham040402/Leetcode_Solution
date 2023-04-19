class Solution {
    public boolean isMatch(String inputString, String pattern) {
        int i = 0;
        int j = 0;
        int starIdx = -1;
        int lastMatch = -1;
        while(i < inputString.length()){
            if(j < pattern.length() && (inputString.charAt(i) == pattern.charAt(j) || pattern.charAt(j) == '?'))                {
                i++;
                j++;
            }
            else if(j < pattern.length() && pattern.charAt(j) == '*'){
                starIdx = j;
                lastMatch = i;
                j++;
            }
            else if(starIdx != -1){
                j = starIdx + 1;
                lastMatch++;
                i = lastMatch;
            }
            else {
                return false;
            }
        }
        boolean isMatch  = true;
        while(j < pattern.length() && pattern.charAt(j) == '*'){
            j++;
        }
        if (i != inputString.length() || j != pattern.length()) {
            isMatch = false;
        }
        return isMatch;
    }
}