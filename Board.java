/**
 * Created by guptah on 7/30/2016.
 */
public class Board {
    private ChessMan[][] chessManBoard = new chessManBoard[8][8];

    public Board() {
        for(int i=0; i<chessManBoard.length; i++){
            for(int j=0; j<chessManBoard.length; j++){
                this.chessManBoard[i][j] = new ChessMan(i, j);
            }
        }
    }

    public Square getChessMan(int x, int y) {
        return chessManBoard[x][y];
    }

}

}
