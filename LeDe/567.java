class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int n = s1.length();
        int m = s2.length();

        if(n > m) return false;
        int[] count = new int[26];
        for(int i=0;i<n;i++){
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if(isZero(count)) return true;
        for(int i=n;i<m;i++){
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - n) - 'a']++;
            if(isZero(count)) return true;
        }
        return false;
    }
    public boolean isZero(int[] count){
        for(int num : count){
            if(num != 0) return false;
        }
        return true;
    }
}
