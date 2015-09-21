public class Solution {
    public int numTrees(int n) {
          //卡塔兰数是组合数学中一个常在各种计数问题中出现的数列,一般格式:C(0) = 1, C(n+1)=2(2n+1)*C(n)/n+2
	        int[] res = new int[n+1];  
            res[0] = 1;  
            res[1] = 1;  
            for(int i=2;i<=n;i++)  
                for(int j=0;j<i;j++)  
                   res[i] += res[j]*res[i-j-1];  
             return res[n]; 
    }
}
