import java.util.Stack;

class Solution{
  public String removeDuplicates(String s){
    Stack<Character> st = new Stack<>();

  for(int i=0;i<s.length;i++){
    if(st.size() != 0 && st.peek() == s.charAt(i)){
      st.pop();
    } else {
      st.push(s.charAt(i));
    }
  }
    String ans = "";
    for(char i : st){
      ans = ans + i;
    }
    return ans;
  }
}
