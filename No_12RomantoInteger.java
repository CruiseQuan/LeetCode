public class Solution {
    public int romanToInt(String s) {
            int sum=0,pre=0,cur;
	        HashMap<Character, Integer>map=new HashMap<Character, Integer>();
	        map.put('I', 1);
	        map.put('V', 5);
	        map.put('X', 10);
	        map.put('L', 50);
	        map.put('C', 100);
	        map.put('D', 500);
	        map.put('M', 1000);
            for(int i=0;i<s.length();i++){
            	cur=map.get(s.charAt(i));
            	sum+=(cur>pre?-pre:pre);
            	pre=cur; 
            }
            sum+=pre;
        	return sum;
    }
}
