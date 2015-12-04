public class Solution {
    public int jump(int[] nums) {
		 int count=0,max,p=0;
		 if(nums.length==1)
		    return count;
		 for(int i=0;i<nums.length;){
			 if(i+nums[i]>=nums.length-1){
				 count++;
				 break;
			 }
			 max=0;
			 for(int j=i+1;j<=Math.min(i+nums[i],nums.length-1);j++)
				 if(j+nums[j]>max){
					 max=j+nums[j];
					 p=j;
				 }
			 i=p;
			 count++;
		 }
	     return count;
	  }
}
