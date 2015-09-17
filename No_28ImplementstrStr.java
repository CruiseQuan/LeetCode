public class Solution {
    public int strStr(String haystack, String needle) {
        
         return KMP(haystack,needle);
    }
    //KMP算法比较复杂，但是时间复杂度为O(n+m)比普通的O(n*m）算法快得多
     public int KMP(String haystack, String needle) {
		 int n=haystack.length(),m=needle.length();
		 //空字符串
		 if(m==0)
		   return 0;
		//pi[i]既是needle[...i]的前缀又是后缀的字符串的最大长度，字符串本身排除在外
		 int []pi=getPartialMatch(needle);
		 //从begin=0,matched=0开始匹配
		 int begin=0,matched=0;
		 //匹配的首个位置的范围
		 while(begin<=n-m){
			 //匹配字符
			 if(matched<m&&haystack.charAt(begin+matched)==needle.charAt(matched)){
				 matched++;//匹配的数量+1
				 if(matched==m)//匹配完毕
					 return begin;//返回位置				 
			 }else{
				 if(matched==0)//一个都不匹配
					 begin++;//尝试下一个位置
				 else{
					 //匹配的字符大于0，在第matched个字符失败
					 //因此h[begin,begin+matched-1]与n[0,matched-1]是匹配的
					 //如果从[begin,begin+matched-1]中含有一个位置k使得
					 //h[begin+k,begin+matched-1]与n[0,matched-1-k]相匹配，那么只需从这个位置开始尝试即可
					 //因为h[begin+k,begin+matched-1]=n[k,matched-1]
					 //所以有n[0,matched-1-k]=n[k,matched-1]
					 //因此这一段即是n[...matched-1]的前缀也是n[...matched-1]的后缀
					 //所以找出一个k使得n[....matched-1]的前缀即后缀最长,那样k就会最小，最靠前而接下来需要匹配的部分最少
					//因为(matched-1)-k+1=pi[matched-1]所以k=matched-pi[matched-1],下一个起始位置为begin+k
					 begin+=matched-pi[matched-1];
					 //因为pi[matched-1]是最长的前缀后缀字符串的长度所以begin+k+pi[matched-1]就是下一个需要检查的字符
					 //所以matched=pi[matched-1]
					 matched=pi[matched-1];
				 }
			 }
		 }
         return -1;
    }
	 //pi[i]既是needle[...i]的前缀又是后缀的字符串的最大长度，利用KMP算法求解
	 public int []getPartialMatch(String needle){
		 int m=needle.length();
		 int []pi=new int[m];
		 int begin=1,matched=0;//begin必须从1开始因为要排除自身
		 while(begin+matched<m){
			 if(needle.charAt(begin+matched)==needle.charAt(matched)){
				 pi[begin+matched]=matched+1;//matched从0开始所以当做长度时加1,needle[...begin+matched]的最长前缀后缀的长度
				 matched++;//匹配成功加一，检测下一字符，其实可以两句可以直接写成++matched,但是分开写更清楚
			 }else{
				 if(matched==0)
					 begin++;
				 else{
					 //kmp算法
					 begin+=matched-pi[matched-1];
					 matched=pi[matched-1];
				 }
			 }
		 }
		 return pi;
	 }
}
