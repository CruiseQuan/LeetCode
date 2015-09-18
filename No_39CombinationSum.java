public class Solution {
        public List<List<Integer>> combinationSum(int[] candidates, int target) {
	    	Arrays.sort(candidates);
	        List<List<Integer>>ret=new ArrayList<List<Integer>>();
	        combinationSum(candidates, target,0, ret,new ArrayList<Integer>());
	        return ret;
	    }
         public void combinationSum(int[] candidates, int target,int index,List<List<Integer>>ret,List<Integer>list) {
	       ArrayList<Integer>arrayList=new ArrayList<Integer>(list);
        	 if(target==0){
	        	ret.add(arrayList);
	        	return;
	        }
	        for(int i=index;i<candidates.length;i++){
	        	if(target>=candidates[i]){
	        	   arrayList.add(candidates[i]);
	        	   combinationSum(candidates, target-candidates[i], i, ret, arrayList);
	        	   arrayList.remove(arrayList.size()-1);
	        	}
	        }
	        	
	    }
}
