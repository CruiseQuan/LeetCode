public class Solution {
     public int trap(int[] height) {
			 int n=height.length,ret=0;
			 int left=0,right=n-1;
			 int maxLeft=0,maxRight=0;//当前while中遇到的最高的左bar和右bar
			 //求出maxLeft和maxRight之间的储水量，就是找出每个当前bar与min(maxLeft,maxRight)的差的和。
			 while(left<=right){
			     if(height[left]<=height[right]){
			         if(height[left]>=maxLeft)
			              maxLeft=height[left];
			         else
			              ret+=maxLeft-height[left];
			         left++;
			     }else{
			         if(height[right]>=maxRight)
			              maxRight=height[right];
			         else
			              ret+=maxRight-height[right];
			         right--;
			     }
			 }
			 return ret;
		 }
}
