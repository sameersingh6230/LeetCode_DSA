import java.util.Stack;

class Solution{
  public int calPoints(String [] op){
    Stack<Integer> st = new Stack<>();

  for (int i=0;i<op.length();i++){
    String a = op[i];
    if(a.equals("C")){
      st.pop();
    } else if(a.equals("D")){
      st.push(st.peek() * 2);
    } else if(a.equals("+")){
      int first = st.pop();
      int second = st.peek();

    st.push(first);
      st.push(first + second);
    } else {
      int n = Integer.paraeInt(a);
      st.push(n);
    }
  }
    int ans;
    while (st.size() != 0){
      ans = ans + st.pop();
    }
    return ans;
  }
}
