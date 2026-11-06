class Solution {
    public int maximalRectangle(char[][] matrix) {
        int m = matrix.length, n = matrix[0].length, ans = 0;
        int[] h = new int[n], st = new int[n + 1];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                h[j] = matrix[i][j] == '1' ? h[j] + 1 : 0;
            }
            int top = -1;
            for(int j=0;j<=n;j++){
                int cur = j == n ? 0 : h[j];
                while(top >= 0 && h[st[top]] > cur){
                    int height = h[st[top--]];
                    int width = top < 0 ? j : j - st[top] - 1;
                    ans = Math.max(ans, height * width);
                }
                st[++top] = j;
            }
        }
        return ans;
    }
}
