public class No_1TwoSum {
	
	 public static int[] twoSum(int[] nums, int target) {
		 HashMap<Integer, Integer>map=new HashMap<Integer, Integer>();
		 int []ret=new int[2];
	     for(int i=0;i<nums.length;i++)
	    	 map.put(nums[i],i+1);//如果有重复，后者会覆盖前者    	
	     for(int i=0;i<nums.length;i++){
	    	 int find=target-nums[i];
	    	 if(map.containsKey(find)){
	    		 int index=map.get(find);
	    		 if(index==i+1)//是自己本身
	    			 continue;
	    		 else if(index<i+1){
	    			 ret[0]=index;
	    			 ret[1]=i+1;
	    		 }else{
	    			 ret[0]=i+1;
	    			 ret[1]=index;
	    		 }
	    		 break;
	    	 }
	     }
	     return ret;
	 }

}
