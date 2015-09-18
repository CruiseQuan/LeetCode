public class Solution {
    public int longestValidParentheses(String s) {
        int length=s.length(),max=0,left=0;
        int[]res=new int [length];//res[i]表示以i为结尾的最长串长度
        for(int i=0;i<length;i++){
        	if(s.charAt(i)=='('){
        		left++;
        		continue;
        	}
        	if(left>0){
        		res[i]=2+res[i-1];//res[i]等于自身的长度2加上前一个的长
        		int lastIndex=i-2-res[i-1];//上一个括号的位置（不包含在i的括号范围内）
        		if(lastIndex>=0)
        			res[i]+=res[lastIndex];//再继承上一个括号的长度  
        		if(max<res[i])
        			max=res[i];
        		left--;
        	}        	
        }
        return max;
    }
}
