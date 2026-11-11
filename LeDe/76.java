class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : t.toCharArray()){
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        int left = 0, right = 0;
        int count = t.length();
        int minLen = Integer.MAX_VALUE;
        int start = 0;
        while(right < s.length()){
            char c = s.charAt(right);
            if(map.containsKey(c)){
                if(map.get(c) > 0){
                    count--;
                }
                map.put(c, map.get(c) - 1);
            }
            right++;
            while(count == 0){
                if(right - left < minLen){
                    minLen = right - left;
                    start = left;
                }
                char ch = s.charAt(left);
                if(map.containsKey(ch)){
                    map.put(ch, map.get(ch) + 1);
                    if(map.get(ch) > 0){
                        count++;
                    }
                }
                left++;
            }
        }
        return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
    }
}
