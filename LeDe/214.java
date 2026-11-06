class Solution {
    public String shortestPalindrome(String s) {
        int n = s.length();
        if(n == 0) return "";
        String rev = new StringBuilder(s).reverse().toString();
        for(int i=0;i<n;i++){
            if(s.substring(0, n - i).equals(rev.substring(i))){
                return rev.substring(0, i) + s;
            }
        }
        return rev + s;
    }
}
