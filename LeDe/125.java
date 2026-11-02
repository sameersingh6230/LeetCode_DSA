class Solution {
    public boolean isPalindrome(String s) {
        String lower ="abcdefghijklmnopqrstuvwxyz";
        String upper ="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String number = "0123456789";
        String ans ="";
        for(int i=0; i<s.length();i++){
            String temp =""+s.charAt(i);
            if(lower.contains(temp)){
                ans += temp;
            }else if(upper.contains(temp)){
                temp = temp.toLowerCase();
                ans +=temp;
            }else if (number.contains(temp)){
                ans += temp;
            }
            }
             int left = 0;
        int right = ans.length() - 1;
        while(left<right){
            if (ans.charAt(left) != ans.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
            return true;
        }
        
    }
