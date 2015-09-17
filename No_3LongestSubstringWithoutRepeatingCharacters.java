public class Solution {
    public int lengthOfLongestSubstring(String s) {
       int max=0,begin=0;	
       int []charMap=new int [256];//256个字符对应的位置记录
       Arrays.fill(charMap,-1);//位置记录初始记为-1
       for(int end=0;end<s.length();end++){
       if(charMap[s.charAt(end)]>=begin) //遇到重复的元素
	   begin=charMap[s.charAt(end)]+1;//获得重复元素的前一个位置
	   charMap[s.charAt(end)]=end;//记录这个元素位置
	   max=Math.max(end-begin+1,max);//两个重复元素之间的字符串长度与之前记录的最大值对比
        }
	return max;
    }
}
