public class Solution {
    public String longestPalindrome(String s) {
      int center=0;//初始最长回文中心为第0个元素
	    int maxLength=0;
	    int begin=0;
	    if(s.length()==0)
	    	return "";
	    for(int i=0;i<s.length();i++){
	    	int temp=longestPalindromeHelp(s,i);;
	    	if(maxLength< temp){
	    		maxLength=temp;
	    		center=i;
	    	}
	    }
	    if(maxLength==1)
	    	return s.charAt(0)+"";
	    if(maxLength%2==0){
	    	begin=center+1-maxLength/2;	    	  
	    }else{
	    	begin=center-maxLength/2;
	    }
	    return s.substring(begin,begin+maxLength);
	          
    }
 
	public  int longestPalindromeHelp(String s,int center) {
		   int one=0,two=0;
		   if(center+1<s.length()&&s.charAt(center)==s.charAt(center+1))
			    two=getLength(s, center-1, center+2,2);
		   one=getLength(s,center-1,center+1,1);
		   return Math.max(one, two);
	}
	
	public  int getLength(String s,int left,int right,int leastLength){
		 int length=leastLength;
		 while(left>=0&&right<=s.length()-1){
		    	if(s.charAt(left)==s.charAt(right)){
		    		length=right-left+1;
		    		left--;
		    		right++;
		    	}else
		    		break;
		    }   
		return length;
	}
    
}
