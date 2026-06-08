
public class TwoDarr {

   public static void PrintArr(int mat[][]){
    for(int i =0; i < mat.length; i++){
        for(int j = 0; j< mat[0].length; j++){
            System.out.print(mat[i][j] + " ");
        }
    }
    System.out.println();
   }

    
 public static void main(String[] args) {
     int row = 2 ,  column = 3;
     int[][] mat= { {2,3,7}, {5,6,7} };

    PrintArr(mat);
    int transpose[][] = new int[column][row];
    for(int i = 0 ; i < row; i++){
        for(int j = 0; j < column; j++){
          transpose[j][i] =  mat[i][j];
        }
    }
    PrintArr(transpose);

    
    

     
 }
}
