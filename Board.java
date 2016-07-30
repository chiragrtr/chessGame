/**
 * Created by guptah on 7/30/2016.
 */
public class Board {
    private ChessMan[][] chessManBoard = new chessManBoard[8][8];

    public Board() {
        for(int rank=0; i<chessManBoard.length; rank++){
            for(int file=0; j<chessManBoard.length; file++){
                this.chessManBoard[rank][file] = new ChessMan(rank, file);
            }
        }
    }

    public Square getChessMan(int rank, int file) {
        return chessManBoard[rank][file];
    }

}

}
