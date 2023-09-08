class Solution {
    public List<List<Integer>> generate(int numRows) {
         List<List<Integer>>triangle=new ArrayList<>();
        if(numRows==0){
            return triangle;
        }
          List<Integer>frow=new ArrayList<>();
        frow.add(1);
        triangle.add(frow);
        for(int i=1;i<numRows;i++){
            List<Integer>prow=triangle.get(i-1);
            List<Integer>row=new ArrayList<>();
            row.add(1);
            for(int j=1;j<i;j++){
                row.add(prow.get(j-1)+prow.get(j));
                
            }
            row.add(1);
            triangle.add(row);
            
        }
        return triangle;
    }
}