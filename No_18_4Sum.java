import java.util.Arrays;
public class Solution {
    public List<List<Integer>> fourSum(int[] num, int target) {
        List<List<Integer>>result=new ArrayList<List<Integer>>();
		 Arrays.sort(num);
		for(int i=0;i<num.length-3;i++){
			if(i>0&&num[i]==num[i-1])
				continue;
			for(int j=i+1;j<num.length-2;j++){
				if(j>i+1&&num[j]==num[j-1])
					continue;
			 int begin=j+1;
			 int end=num.length-1;
			 while(begin<end){
				 int tempSum=num[i]+num[j]+num[begin]+num[end];
					if(tempSum==target){
						List<Integer>temp=new ArrayList<Integer>();
						temp.add(num[i]);
						temp.add(num[j]);
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
					else if(tempSum<target){
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
					
		}			
		 return result;
    }
}
