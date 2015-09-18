public class Solution {
    public List<Integer> findSubstring(String s, String[] words) {
    	List<Integer>res=new ArrayList<Integer>();
    	int wlength=words.length;
    	if(wlength==0)
		    return res;
    	int size=words[0].length();
    	int slength=s.length();
    	if(wlength*size>slength)
            return res;
    	HashMap<String, Integer>wordHashMap=new HashMap<String, Integer>();
    	for(int i=0;i<wlength;i++)
    		wordHashMap.put(words[i],!wordHashMap.containsKey(words[i])?1:wordHashMap.get(words[i])+1);
    	for(int i=0;i<slength-size*wlength+1;i++){
    		HashMap<String, Integer>tempHashMap=new HashMap<String, Integer>(wordHashMap);
    		for(int j=0;j<wlength;j++){
    			 String subString=s.substring(i+j*size, i+(j+1)*size);
    			 if(tempHashMap.containsKey(subString)){
    				 int count=tempHashMap.get(subString);
    				 if(count==1)
    					 tempHashMap.remove(subString);
    				 else
    					 tempHashMap.replace(subString, count-1);
    			 }else{
    				 break;
    			 }
    		}
    		if(tempHashMap.isEmpty())
    			res.add(i);
    	}
    	return res;
    }
}
