public class Solution {
    public boolean isPalindrome(int x) {
		 if(x<0)
			return false;
		long y=0,z=x;
		while(z!=0){
		    //一个数字在int范围内，它的回文也在范围内
			y=y*10+z%10;
			if(y>=Integer.MAX_VALUE)
			   return false;
			z/=10;
		}
		return y==x;     
    }
}
