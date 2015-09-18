public class Solution {
    ArrayList<HashMap<Integer,Boolean>>rowHashMapList,colHashMapList,boxHashMapList;
	ArrayList<Integer>unassignedList;
	int index=0;
    public  void solveSudoku(char[][] board) {
    	init(board);
    	solveSudokuHelp(board);
    }
    public  void init(char[][] board){
    	rowHashMapList=new ArrayList<HashMap<Integer,Boolean>>();
    	colHashMapList=new ArrayList<HashMap<Integer,Boolean>>();
        boxHashMapList=new ArrayList<HashMap<Integer,Boolean>>();  
        unassignedList=new ArrayList<Integer>();
        HashMap<Integer, Boolean>hashMap = new HashMap<Integer, Boolean>();
        for(int j=1;j<=9;j++)
        	hashMap.put(j, false);
        for(int i=0;i<9;i++){
        	  HashMap<Integer, Boolean>hashMapClone = new HashMap<Integer, Boolean>(hashMap);
    		  rowHashMapList.add(hashMapClone);
        }
        for(int i=0;i<9;i++){
      	  HashMap<Integer, Boolean>hashMapClone = new HashMap<Integer, Boolean>(hashMap);
  		  colHashMapList.add(hashMapClone);
        }
        for(int i=0;i<9;i++){
      	  HashMap<Integer, Boolean>hashMapClone = new HashMap<Integer, Boolean>(hashMap);
  		  boxHashMapList.add(hashMapClone);
      }
    	//获取行，格子的hashmap和那些空格的位置
    	for(int i=0;i<9;i++)
    		for(int j=0;j<9;j++){
    			char c=board[i][j];
    			if(c!='.'){
     				rowHashMapList.get(i).replace(c-'0', true);
     				int k=(i/3)*3+j/3;
    				boxHashMapList.get(k).replace(c-'0', true);      				
    			}else{
    				unassignedList.add(i*9+j);
    			}
    		}
    	//获取列的hashmap
    	for(int i=0;i<9;i++)
    		for(int j=0;j<9;j++){
    			char c=board[j][i];
    			if(c!='.')
    				colHashMapList.get(i).replace(c-'0', true);  	
    		}
    	
    	
    }
      public  boolean solveSudokuHelp(char[][] board) {
    	  //返回当前第一个空格的位置
    	   if(index==unassignedList.size())
    		  return true;
    	    int position=unassignedList.get(index);   	    
    	    //获取行列位置
    	    int row=position/9,col=position%9;
    	    //测试1-9
    	    for (int num = 1; num <= 9; num++){
    	    	//如果这个数可行
    	        if (isSafe(row, col, num)){
    	        	//标记
    	            board[row][col] = (char) ('0'+num);
    	            rowHashMapList.get(row).replace(num, true);
    	            colHashMapList.get(col).replace(num, true);
    			      	boxHashMapList.get((row/3)*3+col/3).replace(num, true);
    				      index++;
    	            if (solveSudokuHelp(board))
    	                return true;   	 
    	            //回退
    	            board[row][col] = '.'; 
    	            rowHashMapList.get(row).replace(num, false);
    	            colHashMapList.get(col).replace(num, false);
    	        	boxHashMapList.get((row/3)*3+col/3).replace(num, false);
    	        	index--;
    	        }
    	    }
    	    return false;
    }
      //这个数是否符合规则
   public  boolean isSafe(int row, int col, int num) {
	   if(rowHashMapList.get(row).get(num)) 
		   return false;
	   if(colHashMapList.get(col).get(num)) 
		   return false;
	   if(boxHashMapList.get((row/3)*3+col/3).get(num)) 
		   return false;
	   return true;
	}
}
