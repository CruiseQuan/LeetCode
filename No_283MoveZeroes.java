public class Solution {
     public  void moveZeroes(int[] nums){
		 int n=nums.length;
	      if(n<2)
	    	  return;
	      int count=0,total=0;//计算连续的0的个数，到目前位置出现过的0的个数
	      //每次计算完一连串的0的个数后再移动
	      for(int i=0;i<n-total;){
	    	  if(nums[i]==0){
	    		  count++;
	    		  i++;
	    	  }else{
	    		  if(count>0){//之前有0出现
	    			 rotate(nums, i, n-1-total, count);//i-n-1-total子序列向前移动count个单位 
	    			 i-=(count-1);//重新设置i
	    			 total+=count;
	    			 count=0;	    			
	    		  }else
	    			  i++;	    		  
	    	  }
	      }          
	 }
	 public void rotate(int[]nums,int begin,int end,int steps){
		 for(int i=begin-steps;i<=end-steps;i++)//向前移动
			 nums[i]=nums[i+steps];
		 for(int i=end-steps+1;i<=end;i++)//后面补零
			 nums[i]=0;
	 }
}
