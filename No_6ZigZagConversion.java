public class Solution {
    public String convert(String s, int nRows) {
        int size=s.length();
        if(nRows==1||size<nRows)
           return s;
        String res="";
        String []s1=new String[nRows];
        for(int i=0;i<nRows;i++)
            s1[i]="";
        for(int i=0;i<size;i++){
          int x= (i+1)%(2*nRows-2);
          char c=s.charAt(i);
          if(x==0)
             s1[1]+=c;
         else if(x<=nRows)
             s1[x-1]+=c;
         else
           s1[2*nRows-x-1]+=c;
        }
        for(int i=0;i<nRows;i++)
            res+=s1[i];
        return res;
    }
}
