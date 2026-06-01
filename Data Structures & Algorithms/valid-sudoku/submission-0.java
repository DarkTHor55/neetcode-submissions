class Solution {
        public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i <board.length ; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if(!blockLevel(i,j,board)||!rowCheck(i,j,board)){
                    return false;
                }

            }
        }
    return true;
    }

    private boolean blockLevel(int a,int b,char[][]board){
        char num=board[a][b];
        if(board[a][b] == '.'){
            return true;
        }
        if(a<3&&b<3){
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }

        }else if(a<3&&b>2&&b<6){
            for (int i = 0; i < 3; i++) {
                for (int j = 3; j < 6; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        } else if (a<3&&b>5&&b<9) {
            for (int i = 0; i < 3; i++) {
                for (int j = 6; j < 9; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        }else if(a>2&&a<6&&b<3){
            for (int i = 3; i < 6; i++) {
                for (int j = 0; j < 3; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        }else if(a>2&&a<6&&b>2&&b<6){
            for (int i = 3; i < 6; i++) {
                for (int j = 3; j < 6; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        } else if (a>2&&a<6&&b>5&&b<9) {
            for (int i = 3; i < 6; i++) {
                for (int j = 6; j < 9; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        }else if(a>5&&a<9&&b<3){
            for (int i = 6; i < 9; i++) {
                for (int j = 0; j < 3; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        }else if(a>5&&a<9&&b>2&&b<6){
            for (int i = 6; i < 9; i++) {
                for (int j = 3; j < 6; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        } else if (a>5&&a<9&&b>5&&b<9) {
            for (int i = 6; i < 9; i++) {
                for (int j = 6; j < 9; j++) {
                    if(num == board[i][j] && (i != a || j != b)){
                        return false;
                    }
                }
            }
        }
        return true;
    }

    private boolean rowCheck(int a,int b,char[][]board) {
        if(board[a][b] == '.'){
            return true;
        }
        char num = board[a][b];
        for (int i = 0; i < board[0].length; i++) {
            if (num == board[a][i] && i != b) {
                return false;
            }
        }
        for (int i = 0; i < board[0].length; i++) {
            if (num == board[i][b] && i != a) {
                return false;
            }
        }
        return true;

    }
    
}
