public class backtraking {

    public static boolean isSafe(char board[][], int row , int col){
            //vertical up
            for(int i = row-1; i >= 0 ;i--){
                if(board[i][col] == 'Q'){
                    return false;
                }
            }


            //diagonla left up
            for(int i = row -1 , j = col - 1; i >=0 && j >=0; i--, j-- ){
                 if(board[i][j] == 'Q'){
                    return false;
                }    
            }
            //diagonal right up
            for(int i = row - 1 , j = col+1; i >= 0 && j < board.length; i--, j++){
                 if(board[i][j] == 'Q'){
                    return false;
                }
            }
            return true;
    }
    static int count = 0;
        public static boolean SolveNqueen(char board[][], int row){
             int n = board.length;
            
            if(row == board.length){
               count++;
                return true;
            }
                //column loop
                for(int j = 0; j < n; j++ ){
                    if(isSafe(board, row , j)){
                         board[row][j] = 'Q';
                    if(SolveNqueen(board, row + 1)){
                            return true;
                    }
                    board[row][j] = 'x';
                    }
                   
                }
                return false; 
            
        }
        public static void printBoard(char board[][]){
            System.out.println("-------Chess Board-------");
            int n = board.length;
            for (int i = 0; i < n; i++) {
                for(int j= 0; j < n; j++){
                   System.out.print(board[i][j] + " ");
                }
                System.out.println();
            }
        }





         public static void main(String[] args) {
            int n = 4; 
            char board[][] = new char[n][n];
            //initialize 
            for(int i = 0 ; i < n ; i++){
                for(int j = 0 ; j < n; j++){
                    board[i][j] = 'x';

                }
            }
            if(SolveNqueen(board, 0)){
                System.out.println("Solution is possible ");
                printBoard(board);
            }
            else{
                System.out.println("Solution does't exist");
            }
            // System.out.println("Total Ways of N Queen : " + count);
     }
}