class SetMatrix{
    public static void main(String[] args) {

         int[][] matrix = {
                {1, 1, 0},
                {1, 1, 1},
                {0, 1, 1}
        };

        int row = matrix.length;
        int col = matrix[0].length;

        boolean  r[]= new boolean[row];
        boolean  c[]= new boolean[col];

        for(int i=0;i<row;i++){
            for(int j=0 ;j<col ;j++){
                if(matrix[i][j]==0){
                    r[i]=true;
                    c[j]=true;
                }
            }
        }

        for(int i=0;i<r.length ;i++){
            if(r[i]){
                for(int j=0;j<col ;j++){
                    matrix[i][j]=0;
                }
            }
        }
        
        for(int i=0;i<c.length ;i++){
            if(c[i]){
                for(int j=0;j<row ;j++){
                    matrix[j][i]=0;
                }
            }
        }

        for(int i=0;i<row ;i++){
            for(int j=0;j< col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }



    }
}