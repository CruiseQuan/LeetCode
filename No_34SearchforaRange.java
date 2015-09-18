public class Solution {
    public  int[] searchRange(int[] nums, int target) {
    	int lo=0,hi=nums.length-1;
    	int []ret={-1,-1};
    	//找出第一个target位置
    	while(lo<hi){
    	    int mid=(lo+hi)/2;
    	    if(nums[mid]<target)
    	         lo=mid+1;
    	    else
    	         hi=mid;
    	}
    	if(nums[lo]!=target)
    	     return ret;
    	ret[0]=lo;
    	hi=nums.length-1;
    	while(lo<hi){
    	    //如果mid不右移一位可能会死循环
    	    int mid=(lo+hi)/2+1;
    	    if(nums[mid]>target)
    	         hi=mid-1;
    	    else
    	         lo=mid;
    	}
    	ret[1]=lo;
    	return ret;
    }
    
}
