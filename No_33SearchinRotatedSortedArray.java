public class Solution {
//虽然代码有点长但时间是O(logn)
   public  int search(int[] nums, int target) {
    	int size=nums.length;
    	if(size<=2){
    		for(int i=0;i<size;i++)
    			if(nums[i]==target)
    				return i;
    		return -1;
    	}
    	//长度大于2
    	if(nums[0]<nums[size-1])//这个数组并未因为rotate改变顺序
    		return binarySearch(nums, target, 0, size-1);
    	else{//顺序改变，找出改变的点
    	    int pivot=searchPivot(nums, 0, size-1);
    	    //找到Pivot位置
    	    //分段查找
    	    int result=binarySearch(nums, target,0,pivot);
    	    return result!=-1?result:binarySearch(nums, target,pivot+1,size-1);
    	}
    }
    public int searchPivot(int[] nums,int begin,int end) {	
    	while(true){
    		if(begin+1==end)//如果只剩两个，那第一个就是
        		return begin;
    		int mid=(begin+end)/2;
    		if(nums[begin]<nums[mid])//begin-mid这一段是升序，所以pivot在mid-end中
    			begin=mid;
    		else//begin-mid这一段中存在pivot
    			end=mid;
    	}   	
    }
    public  int binarySearch(int []array,int target,int begin,int end){
		while(begin<=end){
			int mid=(begin+end)/2;
			if(array[mid]==target)
				return mid;
			else if(array[mid]<target)
				begin=mid+1;
			else
				end=mid-1;
	   	}
		return -1;
	}
}
