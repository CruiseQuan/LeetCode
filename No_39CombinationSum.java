public class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    	Arrays.sort(candidates);
	        List<List<Integer>>ret=new ArrayList<List<Integer>>();
	        combinationSum(candidates, target,0, ret,new ArrayList<Integer>());
	        return ret;
	    }
         public void combinationSum(int[] candidates, int target,int index,List<List<Integer>>ret,List<Integer>list) {
        	 if(target==0){
	        	ret.add(new ArrayList<Integer>(list));
	        	return;
	        }
	        for(int i=index;i<candidates.length;i++){
	        	if(target>=candidates[i]){
	        	   list.add(candidates[i]);
	        	   combinationSum(candidates, target-candidates[i], i, ret, list);
	        	  list.remove(list.size()-1);
	        	}else
	        	    break;//因为数组非降序
	        	
	        }
	        	
	    }
}
