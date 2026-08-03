class Solution {
    public boolean isPalindrome(int x) {
        String shadow = String.valueOf(x);
        int start = 0,end = shadow.length()-1;

        while (end > start){
            if(shadow.charAt(start) != shadow.charAt(end))
                return false;

            start++;
            end--;
        }
        return true;
    }
}

