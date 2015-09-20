public class Solution {
    public int firstMissingPositive(int[] nums) {
        int n=nums.length;
        //从位置0开始每个位置都希望放置上1,2....n,第一个不符合条件的位置就是答案
        for(int i=0;i<n;i++)
           while(nums[i]>=1&&nums[i]<=n&&nums[nums[i]-1]!=nums[i]){
               int temp=nums[nums[i]-1];
               nums[nums[i]-1]=nums[i];
               nums[i]=temp;
           }
        for(int i=0;i<n;i++)   
            if(nums[i]!=i+1)
            return i+1;
        return n+1;
        
    }
}
