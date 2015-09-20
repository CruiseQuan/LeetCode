public class Solution {
   public  List<List<Integer>> combinationSum2(int[] candidates, int target) {
		 Arrays.sort(candidates);
		 List<List<Integer>>ret=new ArrayList<List<Integer>>();
		 combinationSum2Help(candidates, target,0,ret,new ArrayList<Integer>());
		 return ret;
	  }
	 public  void combinationSum2Help(int[] candidates, int target, int index,List<List<Integer>>ret,List<Integer>list) {
		if(target==0){
		   ret.add(new ArrayList<Integer>(list));
		   return;
		}
		for(int i=index;i<candidates.length;i++){
		    if(i>index&&candidates[i]==candidates[i-1])
		       continue;
		    if(candidates[i]<=target){
		        list.add(candidates[i]);
		        combinationSum2Help(candidates,target-candidates[i],i+1,ret,list);
		        list.remove(list.size()-1);
		    }else
		         break;
		}
		 
	}
	 
}
