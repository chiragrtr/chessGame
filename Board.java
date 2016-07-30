/**
 * Created by guptah on 7/30/2016.
 */
public class Board {
    private ChessMan[][] chessManBoard = new chessManBoard[8][8];
     private List<Piece> pieces = new ArrayList<>();

    public Board() {
        for(int i=0; i<chessManBoard.length; i++){
            for(int j=0; j<chessManBoard.length; j++){
                this.chessManBoard[i][j] = new ChessMan(i, j);
            }
        }
    }

    public ChessMan getChessMan(int i, int j) {
        return chessManBoard[rank][file];
    }
    
     public void initializePieces(){
        if(this.white == true){
            for(int i=0; i<PAWNS; i++){
                pieces.add(new Pawn(true,i,2));
            }
            pieces.add(new Rook(true, 0, 0));
            pieces.add(new Rook(true, 7, 0));
            pieces.add(new Bishop(true, 2, 0));
            pieces.add(new Bishop(true, 5, 0));
            pieces.add(new Knight(true, 1, 0));
            pieces.add(new Knight(true, 6, 0));
            pieces.add(new Queen(true, 3, 0));
            pieces.add(new King(true, 4, 0));
        } else {
            for(int i=0; i<PAWNS; i++){
                pieces.add(new Pawn(true,i,6));
            }
            pieces.add(new Rook(true, 0, 7));
            pieces.add(new Rook(true, 7, 7));
            pieces.add(new Bishop(true, 2, 7));
            pieces.add(new Bishop(true, 5, 7));
            pieces.add(new Knight(true, 1, 7));
            pieces.add(new Knight(true, 6, 7));
            pieces.add(new Queen(true, 3, 7));
            pieces.add(new King(true, 4, 7));
            }
        }
    }
}
