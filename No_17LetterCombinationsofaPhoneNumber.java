public class Solution {
    public List<String> letterCombinations(String digits) {
         HashMap<Character, String> phoneMap=new HashMap<Character,String>();
       phoneMap.put('2', "abc"); 
       phoneMap.put('3', "def"); 
       phoneMap.put('4', "ghi"); 
       phoneMap.put('5', "jkl"); 
       phoneMap.put('6', "mno"); 
       phoneMap.put('7', "pqrs"); 
       phoneMap.put('8', "tuv");       
       phoneMap.put('9', "wxyz");  
       List<String>resList=new ArrayList<String>();
       int size=digits.length();
       String[]strings=new String[size];
       for(int i=0;i<size;i++){
    	   if(digits.charAt(i)=='0'||digits.charAt(i)=='1')
    		   continue;
    	   strings[i]=phoneMap.get(digits.charAt(i));
       }
       if(strings.length==0)
    	   return resList;
       for(int i=0;i<strings[0].length();i++)
         resList.add(strings[0].charAt(i)+"");
       for(int i=1;i<strings.length;i++){
    	   List<String>templist=new ArrayList<String>(); 
    	   for(int j=0;j<resList.size();j++){
    		   for(int k=0;k<strings[i].length();k++){
    			   templist.add(resList.get(j)+strings[i].charAt(k));
    		   }
    	   }
    	   resList=templist;
       }     
       return resList;  
    }
}
