public class Solution {
    public int maxArea(int[] height) {
         //求两点之间的距离与其中较小ai的乘积
    	int end=height.length-1;
    	if(end<=0)
    		return 0;
    	int begin=0;
    	int max=0;
    	while(begin<end){
    		int min=Math.min(height[begin], height[end]);
    		max=Math.max(max,min*(end-begin));
    		if(min==height[begin]){
    			int newBegin=begin;
    			 while(newBegin<end&&height[newBegin]<=height[begin])//找一个新的begin大于begin,代替它 
                     newBegin++;  
                 begin=newBegin;  
                   
    		}else{
    		int newEnd=end;
   			 while(newEnd>begin&&height[newEnd]<=height[end])//找一个新的end大于end,代替它 
                    newEnd--;  
               end=newEnd;  
    		}          
    	}
    	return max;
    }
}
