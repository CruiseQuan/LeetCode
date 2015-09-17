import java.util.Arrays;

public class Solution {
    public List<List<Integer>> threeSum(int[] num) {
         List<List<Integer>>result=new ArrayList<List<Integer>>();
		 Arrays.sort(num);
		for(int i=0;i<num.length-2;i++){
			if(i>0&&num[i]==num[i-1])
				continue;
			 int begin=i+1;
			 int end=num.length-1;
			 while(begin<end){
					if(num[i]+num[begin]+num[end]==0){
						List<Integer>temp=new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[begin]);
						temp.add(num[end]);
						result.add(temp);
						begin++;
						while(num[begin]==num[begin-1]&&begin<end)
							begin++;
						end--;
						while(num[end]==num[end+1]&&begin<end)
							end--;
					}					
					else if(num[i]+num[begin]+num[end]<0){
						begin++;
						while(num[begin]==num[begin-1]&&begin<end)
							begin++;					
					}
					else {
						end--;
						while(num[end]==num[end+1]&&begin<end)
							end--;
					}
			    }
					
		}			
		 return result;
    }
}
